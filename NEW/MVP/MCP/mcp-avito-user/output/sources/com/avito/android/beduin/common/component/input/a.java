package com.avito.android.beduin.common.component.input;

import Ui.InterfaceC15523b;
import Y41.l;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.design.input.Input;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputComponents.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/input/a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f101543a = new a();

    /* compiled from: InputComponents.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/input/InputChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/input/InputChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.common.component.input.a$a, reason: collision with other inner class name */
    public static final class C3042a extends N implements l<InputChange, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f101544l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BeduinInputModel f101545m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC15523b<BeduinAction> f101546n;

        /* compiled from: InputComponents.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.component.input.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3043a {
            static {
                int[] iArr = new int[InputChange.values().length];
                try {
                    iArr[InputChange.f101528c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InputChange.f101529d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InputChange.f101531f.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InputChange.f101530e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3042a(g gVar, BeduinInputModel beduinInputModel, InterfaceC15523b<BeduinAction> interfaceC15523b) {
            super(1);
            this.f101544l = gVar;
            this.f101545m = beduinInputModel;
            this.f101546n = interfaceC15523b;
        }

        @Override // Y41.l
        public final G0 invoke(InputChange inputChange) {
            int iOrdinal = inputChange.ordinal();
            g gVar = this.f101544l;
            BeduinInputModel beduinInputModel = this.f101545m;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    h.a(gVar, beduinInputModel);
                } else if (iOrdinal == 2) {
                    h.b(gVar, beduinInputModel, this.f101546n);
                } else if (iOrdinal == 3) {
                    Input input = gVar.f101549c;
                    Boolean boolIsEnabled = beduinInputModel.isEnabled();
                    input.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
                }
            } else {
                Input.t(gVar.f101549c, beduinInputModel.getText(), false, 6);
            }
            return G0.f406611a;
        }
    }

    public static void a(@Y61.k g gVar, @Y61.k List list, @Y61.k BeduinInputModel beduinInputModel, @Y61.k InterfaceC15523b interfaceC15523b) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        C3042a c3042a = new C3042a(gVar, beduinInputModel, interfaceC15523b);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(c3042a, list);
    }
}
