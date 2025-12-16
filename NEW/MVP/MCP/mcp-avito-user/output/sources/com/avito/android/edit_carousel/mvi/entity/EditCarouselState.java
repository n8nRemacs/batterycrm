package com.avito.android.edit_carousel.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.edit_carousel.adapter.advert.a;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sy.C48432a;

/* compiled from: EditCarouselState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "Mode", "c", "d", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EditCarouselState extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f146484g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final EditCarouselState f146485h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f146486b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f146487c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c f146488d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Mode f146489e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f146490f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EditCarouselState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$Mode;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f146491b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f146492c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f146493d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f146494e;

        static {
            Mode mode = new Mode("EDIT", 0);
            f146491b = mode;
            Mode mode2 = new Mode("SEARCH", 1);
            f146492c = mode2;
            Mode[] modeArr = {mode, mode2};
            f146493d = modeArr;
            f146494e = kotlin.enums.c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f146493d.clone();
        }
    }

    /* compiled from: EditCarouselState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditCarouselState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$b;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f146495a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f146496b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Set<ExtendedProfileSettingsAdvert> f146497c;

        public b() {
            this(null, false, null, 7, null);
        }

        public static b a(b bVar, Integer num, boolean z12, Set set, int i12) {
            if ((i12 & 1) != 0) {
                num = bVar.f146495a;
            }
            if ((i12 & 2) != 0) {
                z12 = bVar.f146496b;
            }
            if ((i12 & 4) != 0) {
                set = bVar.f146497c;
            }
            bVar.getClass();
            return new b(num, z12, set);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f146495a, bVar.f146495a) && this.f146496b == bVar.f146496b && L.f(this.f146497c, bVar.f146497c);
        }

        public final int hashCode() {
            Integer num = this.f146495a;
            return this.f146497c.hashCode() + r.i((num == null ? 0 : num.hashCode()) * 31, 31, this.f146496b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EditModeState(selectedNameId=");
            sb2.append(this.f146495a);
            sb2.append(", isSaving=");
            sb2.append(this.f146496b);
            sb2.append(", selectedAdverts=");
            return AK.c.u(sb2, this.f146497c, ')');
        }

        public b(@l Integer num, boolean z12, @k Set<ExtendedProfileSettingsAdvert> set) {
            this.f146495a = num;
            this.f146496b = z12;
            this.f146497c = set;
        }

        public /* synthetic */ b(Integer num, boolean z12, Set set, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? new LinkedHashSet() : set);
        }
    }

    /* compiled from: EditCarouselState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$c;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final List<a.b> f146498a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f146499b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final List<C48432a> f146500c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f146501d;

        /* renamed from: e, reason: collision with root package name */
        public final long f146502e;

        /* renamed from: f, reason: collision with root package name */
        public final long f146503f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final Set<ExtendedProfileSettingsAdvert> f146504g;

        public c() {
            this(null, null, null, null, 0L, 0L, null, 127, null);
        }

        public static c a(c cVar, List list, String str, List list2, Integer num, long j12, long j13, LinkedHashSet linkedHashSet, int i12) {
            List list3 = (i12 & 1) != 0 ? cVar.f146498a : list;
            String str2 = (i12 & 2) != 0 ? cVar.f146499b : str;
            List list4 = (i12 & 4) != 0 ? cVar.f146500c : list2;
            Integer num2 = (i12 & 8) != 0 ? cVar.f146501d : num;
            long j14 = (i12 & 16) != 0 ? cVar.f146502e : j12;
            long j15 = (i12 & 32) != 0 ? cVar.f146503f : j13;
            Set<ExtendedProfileSettingsAdvert> set = (i12 & 64) != 0 ? cVar.f146504g : linkedHashSet;
            cVar.getClass();
            return new c(list3, str2, list4, num2, j14, j15, set);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f146498a, cVar.f146498a) && L.f(this.f146499b, cVar.f146499b) && L.f(this.f146500c, cVar.f146500c) && L.f(this.f146501d, cVar.f146501d) && this.f146502e == cVar.f146502e && this.f146503f == cVar.f146503f && L.f(this.f146504g, cVar.f146504g);
        }

        public final int hashCode() {
            List<a.b> list = this.f146498a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.f146499b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<C48432a> list2 = this.f146500c;
            int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.f146501d;
            return this.f146504g.hashCode() + r.g(r.g((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f146502e), 31, this.f146503f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchModeState(items=");
            sb2.append(this.f146498a);
            sb2.append(", query=");
            sb2.append(this.f146499b);
            sb2.append(", sortTypes=");
            sb2.append(this.f146500c);
            sb2.append(", selectedSortType=");
            sb2.append(this.f146501d);
            sb2.append(", totalCount=");
            sb2.append(this.f146502e);
            sb2.append(", pageOffset=");
            sb2.append(this.f146503f);
            sb2.append(", selectedAdverts=");
            return AK.c.u(sb2, this.f146504g, ')');
        }

        public c(@l List<a.b> list, @l String str, @l List<C48432a> list2, @l Integer num, long j12, long j13, @k Set<ExtendedProfileSettingsAdvert> set) {
            this.f146498a = list;
            this.f146499b = str;
            this.f146500c = list2;
            this.f146501d = num;
            this.f146502e = j12;
            this.f146503f = j13;
            this.f146504g = set;
        }

        public /* synthetic */ c(List list, String str, List list2, Integer num, long j12, long j13, Set set, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : list2, (i12 & 8) == 0 ? num : null, (i12 & 16) != 0 ? 0L : j12, (i12 & 32) == 0 ? j13 : 0L, (i12 & 64) != 0 ? new LinkedHashSet() : set);
        }
    }

    static {
        C42822w c42822w = null;
        f146485h = new EditCarouselState(d.c.f146514a, new b(null, false, null, 7, c42822w), new c(null, null, null, null, 0L, 0L, null, 127, null), Mode.f146491b, false, 16, c42822w);
    }

    public /* synthetic */ EditCarouselState(d dVar, b bVar, c cVar, Mode mode, boolean z12, int i12, C42822w c42822w) {
        this(dVar, bVar, cVar, mode, (i12 & 16) != 0 ? true : z12);
    }

    public static EditCarouselState a(EditCarouselState editCarouselState, d dVar, b bVar, c cVar, Mode mode, int i12) {
        if ((i12 & 1) != 0) {
            dVar = editCarouselState.f146486b;
        }
        d dVar2 = dVar;
        if ((i12 & 2) != 0) {
            bVar = editCarouselState.f146487c;
        }
        b bVar2 = bVar;
        if ((i12 & 4) != 0) {
            cVar = editCarouselState.f146488d;
        }
        c cVar2 = cVar;
        if ((i12 & 8) != 0) {
            mode = editCarouselState.f146489e;
        }
        Mode mode2 = mode;
        boolean z12 = (i12 & 16) != 0 ? editCarouselState.f146490f : false;
        editCarouselState.getClass();
        return new EditCarouselState(dVar2, bVar2, cVar2, mode2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCarouselState)) {
            return false;
        }
        EditCarouselState editCarouselState = (EditCarouselState) obj;
        return L.f(this.f146486b, editCarouselState.f146486b) && L.f(this.f146487c, editCarouselState.f146487c) && L.f(this.f146488d, editCarouselState.f146488d) && this.f146489e == editCarouselState.f146489e && this.f146490f == editCarouselState.f146490f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146490f) + ((this.f146489e.hashCode() + ((this.f146488d.hashCode() + ((this.f146487c.hashCode() + (this.f146486b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditCarouselState(viewState=");
        sb2.append(this.f146486b);
        sb2.append(", editModeState=");
        sb2.append(this.f146487c);
        sb2.append(", searchModeState=");
        sb2.append(this.f146488d);
        sb2.append(", currentMode=");
        sb2.append(this.f146489e);
        sb2.append(", firstTimeOpen=");
        return r.x(sb2, this.f146490f, ')');
    }

    public EditCarouselState(@k d dVar, @k b bVar, @k c cVar, @k Mode mode, boolean z12) {
        this.f146486b = dVar;
        this.f146487c = bVar;
        this.f146488d = cVar;
        this.f146489e = mode;
        this.f146490f = z12;
    }

    /* compiled from: EditCarouselState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d;", "", "a", "b", "c", "d", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$a;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$b;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$c;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* compiled from: EditCarouselState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$b;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f146513a = new b();
        }

        /* compiled from: EditCarouselState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$c;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f146514a = new c();
        }

        /* compiled from: EditCarouselState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$d;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.edit_carousel.mvi.entity.EditCarouselState$d$d, reason: collision with other inner class name */
        public static final class C4258d implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C4258d f146515a = new C4258d();
        }

        /* compiled from: EditCarouselState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$a;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f146505a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f146506b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ArrayList f146507c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final C4257a f146508d;

            public a(@l String str, boolean z12, @k ArrayList arrayList, @l C4257a c4257a) {
                this.f146505a = str;
                this.f146506b = z12;
                this.f146507c = arrayList;
                this.f146508d = c4257a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f146505a, aVar.f146505a) && this.f146506b == aVar.f146506b && this.f146507c.equals(aVar.f146507c) && this.f146508d.equals(aVar.f146508d);
            }

            public final int hashCode() {
                String str = this.f146505a;
                return this.f146508d.hashCode() + e.g(this.f146507c, r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f146506b), 31);
            }

            @k
            public final String toString() {
                return "Data(screenTitle=" + this.f146505a + ", isSearchBarVisible=" + this.f146506b + ", list=" + this.f146507c + ", footer=" + this.f146508d + ')';
            }

            /* compiled from: EditCarouselState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselState$d$a$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.edit_carousel.mvi.entity.EditCarouselState$d$a$a, reason: collision with other inner class name */
            public static final /* data */ class C4257a {

                /* renamed from: a, reason: collision with root package name */
                @l
                public final String f146509a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f146510b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f146511c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f146512d;

                public C4257a(@l String str, @k String str2, boolean z12, boolean z13) {
                    this.f146509a = str;
                    this.f146510b = str2;
                    this.f146511c = z12;
                    this.f146512d = z13;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4257a)) {
                        return false;
                    }
                    C4257a c4257a = (C4257a) obj;
                    return L.f(this.f146509a, c4257a.f146509a) && L.f(this.f146510b, c4257a.f146510b) && this.f146511c == c4257a.f146511c && this.f146512d == c4257a.f146512d;
                }

                public final int hashCode() {
                    String str = this.f146509a;
                    return Boolean.hashCode(this.f146512d) + r.i(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f146510b), 31, this.f146511c);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("FooterState(hint=");
                    sb2.append(this.f146509a);
                    sb2.append(", buttonTitle=");
                    sb2.append(this.f146510b);
                    sb2.append(", isButtonEnabled=");
                    sb2.append(this.f146511c);
                    sb2.append(", isButtonLoading=");
                    return r.x(sb2, this.f146512d, ')');
                }

                public /* synthetic */ C4257a(String str, String str2, boolean z12, boolean z13, int i12, C42822w c42822w) {
                    this(str, str2, z12, (i12 & 8) != 0 ? false : z13);
                }
            }
        }
    }
}
