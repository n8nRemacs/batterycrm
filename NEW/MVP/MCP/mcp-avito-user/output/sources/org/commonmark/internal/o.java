package org.commonmark.internal;

import java.util.ArrayList;

/* compiled from: LinkReferenceDefinitionParser.java */
/* loaded from: classes7.dex */
public class o {

    /* renamed from: d, reason: collision with root package name */
    public StringBuilder f420336d;

    /* renamed from: e, reason: collision with root package name */
    public String f420337e;

    /* renamed from: f, reason: collision with root package name */
    public String f420338f;

    /* renamed from: g, reason: collision with root package name */
    public char f420339g;

    /* renamed from: h, reason: collision with root package name */
    public StringBuilder f420340h;

    /* renamed from: a, reason: collision with root package name */
    public b f420333a = b.f420343b;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f420334b = new StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f420335c = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f420341i = false;

    /* compiled from: LinkReferenceDefinitionParser.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f420342a;

        static {
            int[] iArr = new int[b.values().length];
            f420342a = iArr;
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f420342a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f420342a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f420342a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f420342a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f420342a[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkReferenceDefinitionParser.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f420343b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f420344c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f420345d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f420346e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f420347f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f420348g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ b[] f420349h;

        static {
            b bVar = new b("START_DEFINITION", 0);
            f420343b = bVar;
            b bVar2 = new b("LABEL", 1);
            f420344c = bVar2;
            b bVar3 = new b("DESTINATION", 2);
            f420345d = bVar3;
            b bVar4 = new b("START_TITLE", 3);
            f420346e = bVar4;
            b bVar5 = new b("TITLE", 4);
            f420347f = bVar5;
            b bVar6 = new b("PARAGRAPH", 5);
            f420348g = bVar6;
            f420349h = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f420349h.clone();
        }
    }

    public final void a() {
        if (this.f420341i) {
            String strB = org.commonmark.internal.util.a.b(this.f420338f);
            StringBuilder sb2 = this.f420340h;
            String strB2 = sb2 != null ? org.commonmark.internal.util.a.b(sb2.toString()) : null;
            ArrayList arrayList = this.f420335c;
            String str = this.f420337e;
            Q61.s sVar = new Q61.s();
            sVar.f13496f = str;
            sVar.f13497g = strB;
            sVar.f13498h = strB2;
            arrayList.add(sVar);
            this.f420336d = null;
            this.f420341i = false;
            this.f420337e = null;
            this.f420338f = null;
            this.f420340h = null;
        }
    }
}
