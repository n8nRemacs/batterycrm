package g80;

import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_list_view_groups.analytics.ClickArea;
import com.avito.android.remote.model.category_parameters.Purpose;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.u0;
import kotlin.text.C43059p;
import yc.C50213a;

/* compiled from: PhotoItemGroupsImagesGroupsTrackerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg80/e;", "Lg80/d;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f396340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f396341b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object f396342c = P0.c();

    /* compiled from: PhotoItemGroupsImagesGroupsTrackerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f396343a;

        static {
            int[] iArr = new int[Purpose.values().length];
            try {
                iArr[Purpose.SELECT_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Purpose.ADD_TO_LAYOUTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Purpose.REMOVE_FROM_LAYOUTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Purpose.MAKE_FIRST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Purpose.EDIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Purpose.DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f396343a = iArr;
        }
    }

    @Inject
    public e(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f396340a = interfaceC28373a;
        this.f396341b = c50213a;
    }

    @Override // g80.d
    public final void a(@Y61.k Purpose purpose, @Y61.k String str) {
        String str2;
        switch (a.f396343a[purpose.ordinal()]) {
            case 1:
                str2 = "tag";
                break;
            case 2:
                str2 = "setLayout";
                break;
            case 3:
                str2 = "removeLayout";
                break;
            case 4:
                str2 = "main";
                break;
            case 5:
                str2 = "edit";
                break;
            case 6:
                str2 = "delete";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f396340a.c(new C40546a(str, str2, this.f396341b));
    }

    @Override // g80.d
    public final void b(@l String str, @Y61.k ClickArea clickArea) {
        this.f396340a.c(new b(str, clickArea, this.f396341b));
    }

    @Override // g80.d
    public final void c(@l String str, @l String str2, @Y61.k String str3) {
        this.f396340a.c(new c(str, str2, str3, this.f396341b));
    }

    @Override // g80.d
    public final void d(@Y61.k String str, @Y61.k String str2) {
        this.f396340a.c(new k(str, str2, this.f396341b));
    }

    @Override // g80.d
    public final void e(@Y61.k LinkedHashMap linkedHashMap) {
        if (L.f(this.f396342c, linkedHashMap)) {
            return;
        }
        this.f396342c = linkedHashMap;
        i.f396348c.getClass();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            u0 u0Var = u0.f406856a;
            sb2.append(String.format(Locale.ENGLISH, "\"%s\":%s, ", Arrays.copyOf(new Object[]{str, str2}, 2)));
        }
        this.f396340a.c(new i("{".concat(new C43059p(", $").f(sb2.toString(), "")), this.f396341b, null));
    }

    @Override // g80.d
    public final void f(@Y61.k LinkedHashMap linkedHashMap) {
        g.f396346c.getClass();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            u0 u0Var = u0.f406856a;
            sb2.append(String.format(Locale.ENGLISH, "\"%s\":%s, ", Arrays.copyOf(new Object[]{str, str2}, 2)));
        }
        this.f396340a.c(new g("{".concat(new C43059p(", $").f(sb2.toString(), "")), this.f396341b, null));
    }
}
