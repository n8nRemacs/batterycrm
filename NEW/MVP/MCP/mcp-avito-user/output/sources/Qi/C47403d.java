package qi;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinForm;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetLayoutModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqi/d;", "", "Lcom/avito/android/beduin_models/BeduinForm;", "topForm", "Lqi/c;", "tabLayout", "<init>", "(Lcom/avito/android/beduin_models/BeduinForm;Lqi/c;)V", "Lcom/avito/android/beduin_models/BeduinForm;", "getTopForm", "()Lcom/avito/android/beduin_models/BeduinForm;", "Lqi/c;", "a", "()Lqi/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qi.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47403d {

    @com.google.gson.annotations.c("tabLayout")
    @k
    private final C47402c tabLayout;

    @com.google.gson.annotations.c("topForm")
    @l
    private final BeduinForm topForm;

    public C47403d(@l BeduinForm beduinForm, @k C47402c c47402c) {
        this.topForm = beduinForm;
        this.tabLayout = c47402c;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C47402c getTabLayout() {
        return this.tabLayout;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47403d)) {
            return false;
        }
        C47403d c47403d = (C47403d) obj;
        return L.f(this.topForm, c47403d.topForm) && L.f(this.tabLayout, c47403d.tabLayout);
    }

    public final int hashCode() {
        BeduinForm beduinForm = this.topForm;
        return this.tabLayout.hashCode() + ((beduinForm == null ? 0 : beduinForm.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "BottomSheetLayoutModel(topForm=" + this.topForm + ", tabLayout=" + this.tabLayout + ')';
    }
}
