package com.avito.android.beduin.common.component.input;

import Ui.InterfaceC15523b;
import Y41.l;
import com.avito.android.beduin.common.form.transforms.LocalErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.LocalTextTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.ShowRightIconTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.input.n;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.o;
import lj.d;

/* compiled from: TextObservables.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    /* compiled from: TextObservables.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "Lcom/avito/android/beduin/common/component/input/k;", "apply", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BeduinInputModel f101553b;

        public a(BeduinInputModel beduinInputModel) {
            this.f101553b = beduinInputModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            Q q12 = (Q) obj;
            String str = (String) q12.f406619b;
            return new Q(str, j.b(str, (String) q12.f406620c, this.f101553b.getConstraints()));
        }
    }

    /* compiled from: TextObservables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/beduin/common/component/input/k;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Q<? extends String, ? extends k>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinInputModel f101554l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ lj.e f101555m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f101556n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15523b<BeduinAction> f101557o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BeduinInputModel beduinInputModel, lj.e eVar, boolean z12, InterfaceC15523b<BeduinAction> interfaceC15523b) {
            super(1);
            this.f101554l = beduinInputModel;
            this.f101555m = eVar;
            this.f101556n = z12;
            this.f101557o = interfaceC15523b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(Q<? extends String, ? extends k> q12) {
            Q<? extends String, ? extends k> q13 = q12;
            String str = (String) q13.f406619b;
            k kVar = (k) q13.f406620c;
            boolean z12 = this.f101556n;
            lj.e eVar = this.f101555m;
            BeduinInputModel beduinInputModel = this.f101554l;
            i.b(beduinInputModel, str, kVar, eVar, z12);
            List<BeduinAction> onTextChangeActions = beduinInputModel.getOnTextChangeActions();
            if (onTextChangeActions != null) {
                Iterator<T> it = onTextChangeActions.iterator();
                while (it.hasNext()) {
                    this.f101557o.o((BeduinAction) it.next());
                }
            }
            return G0.f406611a;
        }
    }

    public static final void a(@Y61.k g gVar, @Y61.k lj.e eVar, @Y61.k BeduinInputModel beduinInputModel, boolean z12, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        gVar.f101550d.b(A1.h(n.f(gVar.f101549c).D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(new a(beduinInputModel)).q0(1L).y(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()), null, new b(beduinInputModel, eVar, z12, interfaceC15523b), 3));
    }

    public static void b(BeduinInputModel beduinInputModel, String str, k kVar, lj.e eVar, boolean z12) {
        Integer textVersion;
        if (L.f(beduinInputModel.getText(), str)) {
            textVersion = beduinInputModel.getTextVersion();
        } else {
            Integer textVersion2 = beduinInputModel.getTextVersion();
            textVersion = textVersion2 != null ? Integer.valueOf(textVersion2.intValue() + 1) : null;
        }
        int iIntValue = textVersion != null ? textVersion.intValue() : BeduinInputModel.MIN_TEXT_VERSION;
        String strA = j.a(kVar);
        BeduinModel beduinModelApply = !L.f(beduinInputModel.getErrorMessage(), strA) ? beduinInputModel.apply(new LocalErrorMessageTransform(j.a(kVar))).apply(new LocalTextTransform(str, iIntValue, null)) : beduinInputModel.apply(new LocalTextTransform(str, iIntValue, null));
        if (z12) {
            beduinModelApply = beduinModelApply.apply(new ShowErrorMessageTransform(strA != null));
        }
        BeduinModel beduinModelApply2 = beduinModelApply.apply(new ShowRightIconTransform(C43066x.K(str)));
        if (beduinInputModel.equals(beduinModelApply2)) {
            return;
        }
        eVar.h(new d.h(beduinInputModel, beduinModelApply2));
    }
}
