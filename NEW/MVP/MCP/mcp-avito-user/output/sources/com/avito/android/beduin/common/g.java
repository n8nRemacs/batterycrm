package com.avito.android.beduin.common;

import Hq0.C14021c;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.util.A4;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import oi.InterfaceC44779a;

/* compiled from: BeduinInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/g;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC44779a> f103418a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f103419b;

    /* compiled from: BeduinInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103420a;

        static {
            int[] iArr = new int[BeduinExecuteRequestAction.HttpMethod.values().length];
            try {
                iArr[BeduinExecuteRequestAction.HttpMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinExecuteRequestAction.HttpMethod.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinExecuteRequestAction.HttpMethod.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinExecuteRequestAction.HttpMethod.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f103420a = iArr;
        }
    }

    @Inject
    public g(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f103418a = eVar;
        this.f103419b = interfaceC35745a5;
    }

    @Y61.k
    public final W a(@Y61.k String str, @Y61.k BeduinExecuteRequestAction.HttpMethod httpMethod, @Y61.l Map map) {
        return new C42007e(new C14021c(httpMethod, this, C43066x.U("api/", str), A4.j(A4.f318516a, map))).z(this.f103419b.a());
    }
}
