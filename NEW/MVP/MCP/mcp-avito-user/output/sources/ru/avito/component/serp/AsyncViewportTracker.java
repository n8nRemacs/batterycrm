package ru.avito.component.serp;

import Y41.q;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* compiled from: AsyncViewportTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/component/serp/AsyncViewportTracker;", "", "ViewContext", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface AsyncViewportTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AsyncViewportTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewContext {

        /* renamed from: A, reason: collision with root package name */
        public static final ViewContext f430410A;

        /* renamed from: B, reason: collision with root package name */
        public static final /* synthetic */ ViewContext[] f430411B;

        /* renamed from: C, reason: collision with root package name */
        public static final /* synthetic */ a f430412C;

        /* renamed from: c, reason: collision with root package name */
        public static final ViewContext f430413c;

        /* renamed from: d, reason: collision with root package name */
        public static final ViewContext f430414d;

        /* renamed from: e, reason: collision with root package name */
        public static final ViewContext f430415e;

        /* renamed from: f, reason: collision with root package name */
        public static final ViewContext f430416f;

        /* renamed from: g, reason: collision with root package name */
        public static final ViewContext f430417g;

        /* renamed from: h, reason: collision with root package name */
        public static final ViewContext f430418h;

        /* renamed from: i, reason: collision with root package name */
        public static final ViewContext f430419i;

        /* renamed from: j, reason: collision with root package name */
        public static final ViewContext f430420j;

        /* renamed from: k, reason: collision with root package name */
        public static final ViewContext f430421k;

        /* renamed from: l, reason: collision with root package name */
        public static final ViewContext f430422l;

        /* renamed from: m, reason: collision with root package name */
        public static final ViewContext f430423m;

        /* renamed from: n, reason: collision with root package name */
        public static final ViewContext f430424n;

        /* renamed from: o, reason: collision with root package name */
        public static final ViewContext f430425o;

        /* renamed from: p, reason: collision with root package name */
        public static final ViewContext f430426p;

        /* renamed from: q, reason: collision with root package name */
        public static final ViewContext f430427q;

        /* renamed from: r, reason: collision with root package name */
        public static final ViewContext f430428r;

        /* renamed from: s, reason: collision with root package name */
        public static final ViewContext f430429s;

        /* renamed from: t, reason: collision with root package name */
        public static final ViewContext f430430t;

        /* renamed from: u, reason: collision with root package name */
        public static final ViewContext f430431u;

        /* renamed from: v, reason: collision with root package name */
        public static final ViewContext f430432v;

        /* renamed from: w, reason: collision with root package name */
        public static final ViewContext f430433w;

        /* renamed from: x, reason: collision with root package name */
        public static final ViewContext f430434x;

        /* renamed from: y, reason: collision with root package name */
        public static final ViewContext f430435y;

        /* renamed from: z, reason: collision with root package name */
        public static final ViewContext f430436z;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f430437b;

        static {
            ViewContext viewContext = new ViewContext("GRID", 0, "grid");
            f430413c = viewContext;
            ViewContext viewContext2 = new ViewContext("GRID_XL", 1, "grid_XL");
            f430414d = viewContext2;
            ViewContext viewContext3 = new ViewContext("GRID_VIP", 2, "grid_VIP");
            f430415e = viewContext3;
            ViewContext viewContext4 = new ViewContext("GRID_RDS", 3, "grid_rds");
            f430416f = viewContext4;
            ViewContext viewContext5 = new ViewContext("GRID_RDS_VIP", 4, "grid_rds_VIP");
            f430417g = viewContext5;
            ViewContext viewContext6 = new ViewContext("LIST", 5, "list");
            f430418h = viewContext6;
            ViewContext viewContext7 = new ViewContext("SERVICES", 6, "services");
            f430419i = viewContext7;
            ViewContext viewContext8 = new ViewContext("SERVICES_XL", 7, "services_XL");
            f430420j = viewContext8;
            ViewContext viewContext9 = new ViewContext("SERVICES_VIP", 8, "services_VIP");
            f430421k = viewContext9;
            ViewContext viewContext10 = new ViewContext("SERVICES_CONSTRUCTOR", 9, "services_constructor");
            f430422l = viewContext10;
            ViewContext viewContext11 = new ViewContext("VACANCY", 10, "vacancy");
            ViewContext viewContext12 = new ViewContext("VACANCY_XL", 11, "vacancy_XL");
            ViewContext viewContext13 = new ViewContext("VACANCY_VIP", 12, "vacancy_VIP");
            ViewContext viewContext14 = new ViewContext("VACANCY_RDS", 13, "vacancy_rds");
            ViewContext viewContext15 = new ViewContext("DEVELOPMENT", 14, "development");
            f430423m = viewContext15;
            ViewContext viewContext16 = new ViewContext("DEVELOPMENT_XL", 15, "development_XL");
            f430424n = viewContext16;
            ViewContext viewContext17 = new ViewContext("DEVELOPMENT_LIST", 16, "development_list");
            f430425o = viewContext17;
            ViewContext viewContext18 = new ViewContext("DEVELOPMENT_LIST_XL", 17, "development_list_XL");
            f430426p = viewContext18;
            ViewContext viewContext19 = new ViewContext("RICH", 18, "rich");
            f430427q = viewContext19;
            ViewContext viewContext20 = new ViewContext("RICH_XL", 19, "rich_XL");
            f430428r = viewContext20;
            ViewContext viewContext21 = new ViewContext("RICH_VIP", 20, "rich_VIP");
            f430429s = viewContext21;
            ViewContext viewContext22 = new ViewContext("RICH_MINI", 21, "rich_mini");
            f430430t = viewContext22;
            ViewContext viewContext23 = new ViewContext("RICH_SMALL", 22, "rich_small");
            f430431u = viewContext23;
            ViewContext viewContext24 = new ViewContext("RICH_CONSTRUCTOR", 23, "rich_constructor");
            f430432v = viewContext24;
            ViewContext viewContext25 = new ViewContext("LANDING", 24, "landing");
            ViewContext viewContext26 = new ViewContext("LANDING_RECOMMENDATION", 25, "landing_recommendation");
            ViewContext viewContext27 = new ViewContext("LANDING_UNIFIED", 26, "landing_unified");
            ViewContext viewContext28 = new ViewContext("SECTION", 27, "section");
            f430433w = viewContext28;
            ViewContext viewContext29 = new ViewContext("SECTION_VIP", 28, "section_VIP");
            f430434x = viewContext29;
            ViewContext viewContext30 = new ViewContext("GRID_PROFILE", 29, "grid_profile");
            f430435y = viewContext30;
            ViewContext viewContext31 = new ViewContext("ADVERT_GALLERY", 30, "advertisement_gallery");
            f430436z = viewContext31;
            ViewContext viewContext32 = new ViewContext("ADVERT_FULL_GALLERY", 31, "advertisement_full_gallery");
            ViewContext viewContext33 = new ViewContext("CLOSED_ADVERT_GALLERY", 32, "closed_advertisement_gallery");
            f430410A = viewContext33;
            ViewContext[] viewContextArr = {viewContext, viewContext2, viewContext3, viewContext4, viewContext5, viewContext6, viewContext7, viewContext8, viewContext9, viewContext10, viewContext11, viewContext12, viewContext13, viewContext14, viewContext15, viewContext16, viewContext17, viewContext18, viewContext19, viewContext20, viewContext21, viewContext22, viewContext23, viewContext24, viewContext25, viewContext26, viewContext27, viewContext28, viewContext29, viewContext30, viewContext31, viewContext32, viewContext33, new ViewContext("SERP_BEDUIN", 33, "serp_beduin_item")};
            f430411B = viewContextArr;
            f430412C = c.a(viewContextArr);
        }

        public ViewContext(String str, int i12, String str2) {
            this.f430437b = str2;
        }

        public static ViewContext valueOf(String str) {
            return (ViewContext) Enum.valueOf(ViewContext.class, str);
        }

        public static ViewContext[] values() {
            return (ViewContext[]) f430411B.clone();
        }
    }

    void Z70(@k q<? super Integer, ? super Integer, ? super ViewContext, G0> qVar);
}
