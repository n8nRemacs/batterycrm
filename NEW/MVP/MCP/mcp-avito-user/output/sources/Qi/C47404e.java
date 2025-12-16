package qi;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinForm;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetSingleTabLayoutModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lqi/e;", "", "Lcom/avito/android/beduin_models/BeduinForm;", "topForm", "mainForm", "<init>", "(Lcom/avito/android/beduin_models/BeduinForm;Lcom/avito/android/beduin_models/BeduinForm;)V", "Lcom/avito/android/beduin_models/BeduinForm;", "b", "()Lcom/avito/android/beduin_models/BeduinForm;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qi.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47404e {

    @com.google.gson.annotations.c("mainForm")
    @k
    private final BeduinForm mainForm;

    @com.google.gson.annotations.c("topForm")
    @l
    private final BeduinForm topForm;

    public C47404e(@l BeduinForm beduinForm, @k BeduinForm beduinForm2) {
        this.topForm = beduinForm;
        this.mainForm = beduinForm2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final BeduinForm getMainForm() {
        return this.mainForm;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final BeduinForm getTopForm() {
        return this.topForm;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47404e)) {
            return false;
        }
        C47404e c47404e = (C47404e) obj;
        return L.f(this.topForm, c47404e.topForm) && L.f(this.mainForm, c47404e.mainForm);
    }

    public final int hashCode() {
        BeduinForm beduinForm = this.topForm;
        return this.mainForm.hashCode() + ((beduinForm == null ? 0 : beduinForm.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "BottomSheetSingleTabLayoutModel(topForm=" + this.topForm + ", mainForm=" + this.mainForm + ')';
    }
}
