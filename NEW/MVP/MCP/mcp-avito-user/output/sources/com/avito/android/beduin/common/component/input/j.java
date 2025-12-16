package com.avito.android.beduin.common.component.input;

import Y41.l;
import com.avito.android.beduin.common.component.input.k;
import com.avito.android.beduin.network.model.Constraint;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.o0;

/* compiled from: TextValidator.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    /* compiled from: TextValidator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/network/model/Constraint;", "it", "Lcom/avito/android/beduin/common/component/input/k;", "invoke", "(Lcom/avito/android/beduin/network/model/Constraint;)Lcom/avito/android/beduin/common/component/input/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Constraint, k> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f101558l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f101559m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(1);
            this.f101558l = str;
            this.f101559m = str2;
        }

        @Override // Y41.l
        public final k invoke(Constraint constraint) {
            k.a aVar;
            Constraint constraint2 = constraint;
            boolean z12 = constraint2 instanceof Constraint.Regexp;
            String str = this.f101558l;
            if (z12) {
                Constraint.Regexp regexp = (Constraint.Regexp) constraint2;
                if (regexp.getPassOnMatch()) {
                    if (regexp.getPattern().a(str)) {
                        return k.b.f101561a;
                    }
                    aVar = new k.a(constraint2.getErrorText());
                } else {
                    if (regexp.getPattern().e(str)) {
                        return k.b.f101561a;
                    }
                    aVar = new k.a(constraint2.getErrorText());
                }
            } else if (constraint2 instanceof Constraint.Length) {
                Constraint.Length length = (Constraint.Length) constraint2;
                int iE2 = length.getMin();
                int iD2 = length.getMax();
                int length2 = str.length();
                if (iE2 <= length2 && length2 <= iD2) {
                    return k.b.f101561a;
                }
                aVar = new k.a(constraint2.getErrorText());
            } else {
                if (!(constraint2 instanceof Constraint.NotEmpty)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = this.f101559m;
                if (str2 != null) {
                    str = str2;
                }
                if (str.length() != 0) {
                    return k.b.f101561a;
                }
                aVar = new k.a(constraint2.getErrorText());
            }
            return aVar;
        }
    }

    @Y61.l
    public static final String a(@Y61.k k kVar) {
        k.a aVar = kVar instanceof k.a ? (k.a) kVar : null;
        if (aVar != null) {
            return aVar.f101560a;
        }
        return null;
    }

    @Y61.k
    public static final k b(@Y61.k String str, @Y61.l String str2, @Y61.l List list) {
        Object next;
        if (list != null) {
            o0.a aVar = new o0.a(new o0(new C42770s0(list), new a(str, str2)));
            while (true) {
                if (!aVar.f410559b.hasNext()) {
                    next = null;
                    break;
                }
                next = aVar.next();
                if (((k) next) instanceof k.a) {
                    break;
                }
            }
            k kVar = (k) next;
            if (kVar != null) {
                return kVar;
            }
        }
        return k.b.f101561a;
    }
}
