package ru.cyberity.cbr.core.widget.applicantData;

import Y41.l;
import Y61.k;
import android.widget.RadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: _Sequences.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRApplicantDataRadioGroupView$special$$inlined$filterIsInstance$2 extends N implements l<Object, Boolean> {
    public static final CBRApplicantDataRadioGroupView$special$$inlined$filterIsInstance$2 INSTANCE = new CBRApplicantDataRadioGroupView$special$$inlined$filterIsInstance$2();

    public CBRApplicantDataRadioGroupView$special$$inlined$filterIsInstance$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.l
    @k
    public final Boolean invoke(@Y61.l Object obj) {
        return Boolean.valueOf(obj instanceof RadioButton);
    }
}
