package vi;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import com.avito.android.beduin_models.BeduinForm;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: BeduinTabContent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lvi/a;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$c;", "Lcom/avito/android/beduin_models/BeduinForm;", "topForm", "mainForm", "bottomForm", "<init>", "(Lcom/avito/android/beduin_models/BeduinForm;Lcom/avito/android/beduin_models/BeduinForm;Lcom/avito/android/beduin_models/BeduinForm;)V", "Lcom/avito/android/beduin_models/BeduinForm;", "c", "()Lcom/avito/android/beduin_models/BeduinForm;", "b", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C49332a implements TabsScreenModel.c {

    @com.google.gson.annotations.c("bottomForm")
    @l
    private final BeduinForm bottomForm;

    @com.google.gson.annotations.c("mainForm")
    @k
    private final BeduinForm mainForm;

    @com.google.gson.annotations.c("topForm")
    @l
    private final BeduinForm topForm;

    /* compiled from: BeduinTabContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvi/a$a;", "Lvi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vi.a$a, reason: collision with other inner class name */
    public static final class C12787a implements InterfaceC49334c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12787a f440932a = new C12787a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final kotlin.reflect.d<C49332a> f440933b = m0.f406844a.b(C49332a.class);

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f440934c = "beduinScreen";

        @Override // vi.InterfaceC49334c
        @k
        public final String getType() {
            return f440934c;
        }

        @Override // vi.InterfaceC49334c
        @k
        public final kotlin.reflect.d<C49332a> getValue() {
            return f440933b;
        }
    }

    public C49332a(@l BeduinForm beduinForm, @k BeduinForm beduinForm2, @l BeduinForm beduinForm3) {
        this.topForm = beduinForm;
        this.mainForm = beduinForm2;
        this.bottomForm = beduinForm3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final BeduinForm getBottomForm() {
        return this.bottomForm;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final BeduinForm getMainForm() {
        return this.mainForm;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final BeduinForm getTopForm() {
        return this.topForm;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49332a)) {
            return false;
        }
        C49332a c49332a = (C49332a) obj;
        return L.f(this.topForm, c49332a.topForm) && L.f(this.mainForm, c49332a.mainForm) && L.f(this.bottomForm, c49332a.bottomForm);
    }

    public final int hashCode() {
        BeduinForm beduinForm = this.topForm;
        int iHashCode = (this.mainForm.hashCode() + ((beduinForm == null ? 0 : beduinForm.hashCode()) * 31)) * 31;
        BeduinForm beduinForm2 = this.bottomForm;
        return iHashCode + (beduinForm2 != null ? beduinForm2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BeduinTabContent(topForm=" + this.topForm + ", mainForm=" + this.mainForm + ", bottomForm=" + this.bottomForm + ')';
    }
}
