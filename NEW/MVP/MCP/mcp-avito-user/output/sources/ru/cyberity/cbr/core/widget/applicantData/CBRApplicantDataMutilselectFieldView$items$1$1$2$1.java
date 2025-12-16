package ru.cyberity.cbr.core.widget.applicantData;

import Y41.l;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.h;

/* compiled from: CBRApplicantDataMutilselectFieldView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e$a$a;", "item", "", "invoke", "(Lru/cyberity/cbr/core/data/model/h$e$a$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRApplicantDataMutilselectFieldView$items$1$1$2$1 extends N implements l<h.e.a.C12451a, Boolean> {
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRApplicantDataMutilselectFieldView$items$1$1$2$1(String str) {
        super(1);
        this.$tag = str;
    }

    @Override // Y41.l
    @k
    public final Boolean invoke(@k h.e.a.C12451a c12451a) {
        return Boolean.valueOf(L.f(c12451a.getId(), this.$tag));
    }
}
