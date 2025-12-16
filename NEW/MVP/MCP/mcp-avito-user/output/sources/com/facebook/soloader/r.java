package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.G;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ExtractFromZipSoSource.java */
/* loaded from: classes16.dex */
public class r extends G {

    /* renamed from: h, reason: collision with root package name */
    public final File f340885h;

    /* renamed from: i, reason: collision with root package name */
    public final String f340886i;

    /* compiled from: ExtractFromZipSoSource.java */
    public static final class b extends G.a implements Comparable {

        /* renamed from: d, reason: collision with root package name */
        public final ZipEntry f340887d;

        /* renamed from: e, reason: collision with root package name */
        public final int f340888e;

        public b(String str, ZipEntry zipEntry, int i12) {
            super(str, "pseudo-zip-hash-1-" + zipEntry.getName() + "-" + zipEntry.getSize() + "-" + zipEntry.getCompressedSize() + "-" + zipEntry.getCrc());
            this.f340887d = zipEntry;
            this.f340888e = i12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f340839b.compareTo(((b) obj).f340839b);
        }
    }

    /* compiled from: ExtractFromZipSoSource.java */
    public class c extends G.f {

        /* renamed from: b, reason: collision with root package name */
        @I41.h
        public b[] f340889b;

        /* renamed from: c, reason: collision with root package name */
        public final ZipFile f340890c;

        /* renamed from: d, reason: collision with root package name */
        public final r f340891d;

        /* compiled from: ExtractFromZipSoSource.java */
        public final class a extends G.d {

            /* renamed from: b, reason: collision with root package name */
            public int f340893b;

            public a(a aVar) {
            }

            @Override // com.facebook.soloader.G.d
            public final boolean a() {
                c cVar = c.this;
                cVar.c();
                return this.f340893b < cVar.f340889b.length;
            }

            @Override // com.facebook.soloader.G.d
            public final G.e b() throws IOException {
                c cVar = c.this;
                cVar.c();
                b[] bVarArr = cVar.f340889b;
                int i12 = this.f340893b;
                this.f340893b = i12 + 1;
                b bVar = bVarArr[i12];
                InputStream inputStream = cVar.f340890c.getInputStream(bVar.f340887d);
                try {
                    return new G.e(bVar, inputStream);
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
            }
        }

        public c(r rVar) {
            this.f340890c = new ZipFile(r.this.f340885h);
            this.f340891d = rVar;
        }

        @Override // com.facebook.soloader.G.f
        public final G.b a() {
            return new G.b(c());
        }

        @Override // com.facebook.soloader.G.f
        public final G.d b() {
            return new a(null);
        }

        public final b[] c() {
            int i12;
            if (this.f340889b == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap map = new HashMap();
                Pattern patternCompile = Pattern.compile(r.this.f340886i);
                String[] supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
                Enumeration<? extends ZipEntry> enumerationEntries = this.f340890c.entries();
                while (true) {
                    i12 = 0;
                    if (!enumerationEntries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        while (true) {
                            if (i12 >= supportedAbis.length) {
                                i12 = -1;
                                break;
                            }
                            String str = supportedAbis[i12];
                            if (str != null && strGroup.equals(str)) {
                                break;
                            }
                            i12++;
                        }
                        if (i12 >= 0) {
                            linkedHashSet.add(strGroup);
                            b bVar = (b) map.get(strGroup2);
                            if (bVar == null || i12 < bVar.f340888e) {
                                map.put(strGroup2, new b(strGroup2, zipEntryNextElement, i12));
                            }
                        }
                    }
                }
                this.f340891d.getClass();
                b[] bVarArr = (b[]) map.values().toArray(new b[map.size()]);
                Arrays.sort(bVarArr);
                int i13 = 0;
                for (int i14 = 0; i14 < bVarArr.length; i14++) {
                    b bVar2 = bVarArr[i14];
                    if (d(bVar2.f340887d, bVar2.f340839b)) {
                        i13++;
                    } else {
                        bVarArr[i14] = null;
                    }
                }
                b[] bVarArr2 = new b[i13];
                int i15 = 0;
                while (i12 < bVarArr.length) {
                    b bVar3 = bVarArr[i12];
                    if (bVar3 != null) {
                        bVarArr2[i15] = bVar3;
                        i15++;
                    }
                    i12++;
                }
                this.f340889b = bVarArr2;
            }
            return this.f340889b;
        }

        @Override // com.facebook.soloader.G.f, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f340890c.close();
        }

        public boolean d(ZipEntry zipEntry, String str) {
            return true;
        }
    }

    public r(Context context, String str, File file) {
        super(context, str);
        this.f340885h = file;
        this.f340886i = "^lib/([^/]+)/([^/]+\\.so)$";
    }

    @Override // com.facebook.soloader.G
    public G.f k() {
        return new c(this);
    }
}
