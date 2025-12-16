package ru.cyberity.cbr.core.presentation.form.model;

import Y41.p;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PolishNotationSolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "x", "y", "invoke", "(ZZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PolishNotationSolver$operationMap$1 extends N implements p<Boolean, Boolean, Boolean> {
    public static final PolishNotationSolver$operationMap$1 INSTANCE = new PolishNotationSolver$operationMap$1();

    public PolishNotationSolver$operationMap$1() {
        super(2);
    }

    @k
    public final Boolean invoke(boolean z12, boolean z13) {
        return Boolean.valueOf(z12 && z13);
    }

    @Override // Y41.p
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
        return invoke(bool.booleanValue(), bool2.booleanValue());
    }
}
