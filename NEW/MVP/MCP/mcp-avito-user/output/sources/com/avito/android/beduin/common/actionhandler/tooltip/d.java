package com.avito.android.beduin.common.actionhandler.tooltip;

import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import com.avito.android.beduin.common.action.BeduinTooltipAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTooltipObserverImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/tooltip/d;", "Lcom/avito/android/beduin/common/actionhandler/tooltip/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100443a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.actionhandler.tooltip.a f100444b;

    /* compiled from: BeduinTooltipObserverImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100445a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100446b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f100447c;

        static {
            int[] iArr = new int[BeduinTooltipAction.MainPosition.values().length];
            try {
                iArr[BeduinTooltipAction.MainPosition.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinTooltipAction.MainPosition.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinTooltipAction.MainPosition.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinTooltipAction.MainPosition.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100445a = iArr;
            int[] iArr2 = new int[BeduinTooltipAction.TailPosition.values().length];
            try {
                iArr2[BeduinTooltipAction.TailPosition.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BeduinTooltipAction.TailPosition.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BeduinTooltipAction.TailPosition.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f100446b = iArr2;
            int[] iArr3 = new int[BeduinTooltipAction.Style.values().length];
            try {
                iArr3[BeduinTooltipAction.Style.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BeduinTooltipAction.Style.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BeduinTooltipAction.Style.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BeduinTooltipAction.Style.INVERSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BeduinTooltipAction.Style.INVERSE_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            f100447c = iArr3;
        }
    }

    /* compiled from: BeduinTooltipObserverImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/actionhandler/tooltip/d$b", "Landroidx/lifecycle/q;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23057q {

        /* renamed from: b, reason: collision with root package name */
        @l
        public y f100448b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40691b f100450d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ gj.i f100451e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Integer f100452f;

        /* compiled from: BeduinTooltipObserverImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTooltipAction;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/action/BeduinTooltipAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements l41.g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f100453b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC40691b f100454c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ gj.i f100455d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Integer f100456e;

            public a(d dVar, InterfaceC40691b interfaceC40691b, gj.i iVar, Integer num) {
                this.f100453b = dVar;
                this.f100454c = interfaceC40691b;
                this.f100455d = iVar;
                this.f100456e = num;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
            @Override // l41.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 444
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.actionhandler.tooltip.d.b.a.accept(java.lang.Object):void");
            }
        }

        public b(InterfaceC40691b interfaceC40691b, gj.i iVar, Integer num) {
            this.f100450d = interfaceC40691b;
            this.f100451e = iVar;
            this.f100452f = num;
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onStart(@k InterfaceC22983P interfaceC22983P) {
            d dVar = d.this;
            this.f100448b = (y) dVar.f100444b.f100441b.t0(new a(dVar, this.f100450d, this.f100451e, this.f100452f));
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onStop(@k InterfaceC22983P interfaceC22983P) {
            y yVar = this.f100448b;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
        }
    }

    @Inject
    public d(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k com.avito.android.beduin.common.actionhandler.tooltip.a aVar) {
        this.f100443a = interfaceC15523b;
        this.f100444b = aVar;
    }

    public static com.avito.android.lib.design.tooltip.a b(BeduinTooltipAction.TailPosition tailPosition) {
        int i12 = a.f100446b[tailPosition.ordinal()];
        if (i12 == 1) {
            return new b.c();
        }
        if (i12 == 2) {
            return new b.C5327b();
        }
        if (i12 == 3) {
            return new b.a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.avito.android.lib.design.tooltip.c c(BeduinTooltipAction.TailPosition tailPosition, BeduinTooltipAction.Position position) {
        int i12 = 1;
        if (position.getAnchorPosition() != null) {
            int i13 = a.f100446b[tailPosition.ordinal()];
            if (i13 == 1) {
                return new i.c(b(position.getAnchorPosition()));
            }
            if (i13 == 2) {
                return new i.b(b(position.getAnchorPosition()));
            }
            if (i13 == 3) {
                return new i.a(b(position.getAnchorPosition()));
            }
            throw new NoWhenBranchMatchedException();
        }
        int i14 = a.f100446b[tailPosition.ordinal()];
        com.avito.android.lib.design.tooltip.a aVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (i14 == 1) {
            return new i.c(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        }
        if (i14 == 2) {
            return new i.b(objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
        }
        if (i14 == 3) {
            return new i.a(aVar, i12, objArr5 == true ? 1 : 0);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.beduin.common.actionhandler.tooltip.c
    public final void a(@k InterfaceC40691b interfaceC40691b, @k gj.i iVar, @k Lifecycle lifecycle, @l Integer num) {
        lifecycle.a(new b(interfaceC40691b, iVar, num));
    }
}
