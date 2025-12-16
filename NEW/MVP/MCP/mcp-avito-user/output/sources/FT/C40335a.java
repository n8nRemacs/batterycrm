package fT;

import FV0.c;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.core.os.C22777e;
import androidx.view.n;
import com.avito.android.util.V2;
import com.avito.beduin.v2.interaction.navigation.flow.ResultStatus;
import com.avito.beduin.v2.interaction.navigation.flow.j;
import com.avito.beduin.v2.interaction.navigation.flow.r;
import com.avito.beduin.v2.interaction.navigation.flow.s;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoCloseWithResultClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LfT/a;", "Lcom/avito/beduin/v2/interaction/navigation/flow/j;", "<init>", "()V", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fT.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40335a implements j {

    /* renamed from: b, reason: collision with root package name */
    @l
    public FV0.a f395883b;

    /* compiled from: AvitoCloseWithResultClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LfT/a$a;", "", "<init>", "()V", "", "BEDUIN_ACTIVITY_RESULT_ERROR", "I", "", "TAG", "Ljava/lang/String;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fT.a$a, reason: collision with other inner class name */
    public static final class C11152a {
        public /* synthetic */ C11152a(C42822w c42822w) {
            this();
        }

        public C11152a() {
        }
    }

    /* compiled from: AvitoCloseWithResultClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fT.a$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ResultStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResultStatus.a aVar = ResultStatus.f337498c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ResultStatus.a aVar2 = ResultStatus.f337498c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new C11152a(null);
    }

    public static void k(n nVar, ResultStatus resultStatus, s sVar) {
        int i12;
        int iOrdinal = resultStatus.ordinal();
        if (iOrdinal == 0) {
            i12 = -1;
        } else if (iOrdinal != 1) {
            i12 = 2;
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i12 = 0;
        }
        Intent intent = new Intent();
        r[] rVarArr = sVar.f337542a;
        ArrayList arrayList = new ArrayList(rVarArr.length);
        for (r rVar : rVarArr) {
            arrayList.add(new Q(rVar.f337540a, rVar.f337541b));
        }
        Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
        intent.putExtras(C22777e.b((Q[]) Arrays.copyOf(qArr, qArr.length)));
        nVar.setResult(i12, intent);
    }

    @Override // FV0.h
    public final void P() {
        this.f395883b = null;
    }

    @Override // FV0.h
    public final void Q(@k FV0.a aVar) {
        this.f395883b = aVar;
    }

    public final void b(@k ResultStatus resultStatus, @k s sVar) {
        FV0.a aVar = this.f395883b;
        if (aVar instanceof FV0.b) {
            k(((FV0.b) aVar).N3(), resultStatus, sVar);
        } else if (aVar instanceof c) {
            k(((c) aVar).j1().requireActivity(), resultStatus, sVar);
        } else if (aVar == null) {
            V2.f318762a.j("AvitoCloseWithResultClient", "BeduinHost not attached to client, the result wasn't set", null);
        }
    }
}
