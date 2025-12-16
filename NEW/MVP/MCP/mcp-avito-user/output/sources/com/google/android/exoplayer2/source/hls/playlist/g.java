package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: HlsMultivariantPlaylist.java */
/* loaded from: classes6.dex */
public class g extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final g f346510n = new g("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d, reason: collision with root package name */
    public final List<Uri> f346511d;

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f346512e;

    /* renamed from: f, reason: collision with root package name */
    public final List<a> f346513f;

    /* renamed from: g, reason: collision with root package name */
    public final List<a> f346514g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f346515h;

    /* renamed from: i, reason: collision with root package name */
    public final List<a> f346516i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final I f346517j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final List<I> f346518k;

    /* renamed from: l, reason: collision with root package name */
    public final Map<String, String> f346519l;

    /* renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f346520m;

    /* compiled from: HlsMultivariantPlaylist.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Uri f346521a;

        /* renamed from: b, reason: collision with root package name */
        public final I f346522b;

        /* renamed from: c, reason: collision with root package name */
        public final String f346523c;

        public a(@P Uri uri, I i12, String str) {
            this.f346521a = uri;
            this.f346522b = i12;
            this.f346523c = str;
        }
    }

    /* compiled from: HlsMultivariantPlaylist.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f346524a;

        /* renamed from: b, reason: collision with root package name */
        public final I f346525b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public final String f346526c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final String f346527d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public final String f346528e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public final String f346529f;

        public b(Uri uri, I i12, @P String str, @P String str2, @P String str3, @P String str4) {
            this.f346524a = uri;
            this.f346525b = i12;
            this.f346526c = str;
            this.f346527d = str2;
            this.f346528e = str3;
            this.f346529f = str4;
        }
    }

    public g(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @P I i12, @P List<I> list7, boolean z12, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z12);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list2.size(); i13++) {
            Uri uri = list2.get(i13).f346524a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.f346511d = Collections.unmodifiableList(arrayList);
        this.f346512e = Collections.unmodifiableList(list2);
        this.f346513f = Collections.unmodifiableList(list3);
        this.f346514g = Collections.unmodifiableList(list4);
        this.f346515h = Collections.unmodifiableList(list5);
        this.f346516i = Collections.unmodifiableList(list6);
        this.f346517j = i12;
        this.f346518k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f346519l = Collections.unmodifiableMap(map);
        this.f346520m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            Uri uri = ((a) list.get(i12)).f346521a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, List list2, int i12) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i13 = 0; i13 < list.size(); i13++) {
            Object obj = list.get(i13);
            int i14 = 0;
            while (true) {
                if (i14 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i14);
                    if (streamKey.f345801c == i12 && streamKey.f345802d == i13) {
                        arrayList.add(obj);
                        break;
                    }
                    i14++;
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.m
    public final h a(List list) {
        return new g(this.f346530a, this.f346531b, c(this.f346512e, list, 0), Collections.emptyList(), c(this.f346514g, list, 1), c(this.f346515h, list, 2), Collections.emptyList(), this.f346517j, this.f346518k, this.f346532c, this.f346519l, this.f346520m);
    }
}
