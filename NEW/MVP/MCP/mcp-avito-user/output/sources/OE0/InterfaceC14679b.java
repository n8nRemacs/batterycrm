package Oe0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.Navigation;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestCategoryInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LOe0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LOe0/b$a;", "LOe0/b$b;", "LOe0/b$c;", "LOe0/b$d;", "LOe0/b$e;", "LOe0/b$f;", "LOe0/b$g;", "LOe0/b$h;", "LOe0/b$i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oe0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC14679b {

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/b$a;", "LOe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$a */
    public static final /* data */ class a implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CategoryModel f12455a;

        public a(@k CategoryModel categoryModel) {
            this.f12455a = categoryModel;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f12455a, ((a) obj).f12455a);
        }

        public final int hashCode() {
            return this.f12455a.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeVertical(model=" + this.f12455a + ')';
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/b$b;", "LOe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0798b implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12456a;

        public C0798b(boolean z12) {
            this.f12456a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0798b) && this.f12456a == ((C0798b) obj).f12456a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12456a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseWizard(stayOnSuggests="), this.f12456a, ')');
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/b$c;", "LOe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$c */
    public static final /* data */ class c implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f12457a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 782785376;
        }

        @k
        public final String toString() {
            return "GoToPreviousStep";
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/b$d;", "LOe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$d */
    public static final /* data */ class d implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Navigation f12458a;

        public d(@k Navigation navigation2) {
            this.f12458a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12458a, ((d) obj).f12458a);
        }

        public final int hashCode() {
            return this.f12458a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenWizard(navigation=" + this.f12458a + ')';
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/b$e;", "LOe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$e */
    public static final /* data */ class e implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f12459a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -690016450;
        }

        @k
        public final String toString() {
            return "SaveAndExit";
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/b$f;", "LOe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$f */
    public static final /* data */ class f implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12460a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f12461b;

        public f(@k ArrayList arrayList, boolean z12) {
            this.f12460a = z12;
            this.f12461b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f12460a == fVar.f12460a && this.f12461b.equals(fVar.f12461b);
        }

        public final int hashCode() {
            return this.f12461b.hashCode() + (Boolean.hashCode(this.f12460a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(isPublishButtonVisible=");
            sb2.append(this.f12460a);
            sb2.append(", suggestions=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f12461b, ')');
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/b$g;", "LOe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$g */
    public static final /* data */ class g implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError.Custom f12462a;

        public g(@k ApiError.Custom custom) {
            this.f12462a = custom;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f12462a.equals(((g) obj).f12462a);
        }

        public final int hashCode() {
            return this.f12462a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowError(apiError=" + this.f12462a + ')';
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOe0/b$h;", "LOe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$h */
    public static final /* data */ class h implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f12463a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 206857061;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: SuggestCategoryInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOe0/b$i;", "LOe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oe0.b$i */
    public static final /* data */ class i implements InterfaceC14679b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ru.avito.component.toolbar.d f12464a;

        public i(@k ru.avito.component.toolbar.d dVar) {
            this.f12464a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f12464a, ((i) obj).f12464a);
        }

        public final int hashCode() {
            return this.f12464a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnboarding(onboardingData=" + this.f12464a + ')';
        }
    }
}
