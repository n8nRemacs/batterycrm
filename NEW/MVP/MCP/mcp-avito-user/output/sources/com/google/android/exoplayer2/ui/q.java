package com.google.android.exoplayer2.ui;

import android.text.Html;
import com.google.android.exoplayer2.ui.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes6.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f347541a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f347542a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f347543b;

        public b() {
            throw null;
        }

        public b(String str, Map map, a aVar) {
            this.f347542a = str;
            this.f347543b = map;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    public static final class c {

        /* renamed from: e, reason: collision with root package name */
        public static final r f347544e;

        /* renamed from: f, reason: collision with root package name */
        public static final r f347545f;

        /* renamed from: a, reason: collision with root package name */
        public final int f347546a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347547b;

        /* renamed from: c, reason: collision with root package name */
        public final String f347548c;

        /* renamed from: d, reason: collision with root package name */
        public final String f347549d;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.ui.r] */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.exoplayer2.ui.r] */
        static {
            final int i12 = 0;
            f347544e = new Comparator() { // from class: com.google.android.exoplayer2.ui.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    q.c cVar = (q.c) obj;
                    q.c cVar2 = (q.c) obj2;
                    switch (i12) {
                        case 0:
                            int iCompare = Integer.compare(cVar2.f347547b, cVar.f347547b);
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            int iCompareTo = cVar.f347548c.compareTo(cVar2.f347548c);
                            return iCompareTo != 0 ? iCompareTo : cVar.f347549d.compareTo(cVar2.f347549d);
                        default:
                            int iCompare2 = Integer.compare(cVar2.f347546a, cVar.f347546a);
                            if (iCompare2 != 0) {
                                return iCompare2;
                            }
                            int iCompareTo2 = cVar2.f347548c.compareTo(cVar.f347548c);
                            return iCompareTo2 != 0 ? iCompareTo2 : cVar2.f347549d.compareTo(cVar.f347549d);
                    }
                }
            };
            final int i13 = 1;
            f347545f = new Comparator() { // from class: com.google.android.exoplayer2.ui.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    q.c cVar = (q.c) obj;
                    q.c cVar2 = (q.c) obj2;
                    switch (i13) {
                        case 0:
                            int iCompare = Integer.compare(cVar2.f347547b, cVar.f347547b);
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            int iCompareTo = cVar.f347548c.compareTo(cVar2.f347548c);
                            return iCompareTo != 0 ? iCompareTo : cVar.f347549d.compareTo(cVar2.f347549d);
                        default:
                            int iCompare2 = Integer.compare(cVar2.f347546a, cVar.f347546a);
                            if (iCompare2 != 0) {
                                return iCompare2;
                            }
                            int iCompareTo2 = cVar2.f347548c.compareTo(cVar.f347548c);
                            return iCompareTo2 != 0 ? iCompareTo2 : cVar2.f347549d.compareTo(cVar.f347549d);
                    }
                }
            };
        }

        public c(int i12, int i13, String str, String str2, a aVar) {
            this.f347546a = i12;
            this.f347547b = i13;
            this.f347548c = str;
            this.f347549d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f347550a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f347551b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f347541a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
