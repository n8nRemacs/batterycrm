package com.avito.android.iac_dialer.impl_module.push_handler;

import Y41.l;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.permissions.z;
import com.avito.android.remote.notification.U;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import vK.InterfaceC49223a;

/* compiled from: IacPushHandlerImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/push_handler/a;", "LSK/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements SK.a {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final AtomicInteger f166190l;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC49223a f166191a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BL.a f166192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final z f166193c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h31.e<Gson> f166194d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Context f166195e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final F f166196f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f166197g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.app_foreground_provider.util_module.a f166198h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Bk0.f f166199i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final IacTechInfoStorage f166200j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final R0 f166201k;

    /* compiled from: IacPushHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/push_handler/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "pushCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.push_handler.a$a, reason: collision with other inner class name */
    public static final class C4927a {
        public /* synthetic */ C4927a(C42822w c42822w) {
            this();
        }

        public C4927a() {
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<U> {
    }

    /* compiled from: IacPushHandlerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            ((a) this.receiver).b(str);
            return G0.f406611a;
        }
    }

    /* compiled from: IacPushHandlerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            ((a) this.receiver).b(str);
            return G0.f406611a;
        }
    }

    /* compiled from: IacPushHandlerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            ((a) this.receiver).b(str);
            return G0.f406611a;
        }
    }

    /* compiled from: IacPushHandlerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            ((a) this.receiver).b(str);
            return G0.f406611a;
        }
    }

    /* compiled from: IacPushHandlerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            ((a) this.receiver).b(str);
            return G0.f406611a;
        }
    }

    /* compiled from: IacPushHandlerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            ((a) this.receiver).b(str);
            return G0.f406611a;
        }
    }

    static {
        new C4927a(null);
        f166190l = new AtomicInteger();
    }

    @Inject
    public a(@k InterfaceC49223a interfaceC49223a, @k BL.a aVar, @k z zVar, @k h31.e<Gson> eVar, @k Context context, @k F f12, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.app_foreground_provider.util_module.a aVar2, @k Bk0.f fVar, @k IacTechInfoStorage iacTechInfoStorage, @k R0 r02) {
        this.f166191a = interfaceC49223a;
        this.f166192b = aVar;
        this.f166193c = zVar;
        this.f166194d = eVar;
        this.f166195e = context;
        this.f166196f = f12;
        this.f166197g = interfaceC28373a;
        this.f166198h = aVar2;
        this.f166199i = fVar;
        this.f166200j = iacTechInfoStorage;
        this.f166201k = r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c8  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [com.avito.android.iac_dialer.impl_module.push_handler.a$d] */
    @Override // SK.a
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r38, int r39, @Y61.k java.lang.String r40, @Y61.l java.util.Map r41) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.push_handler.a.a(int, int, java.lang.String, java.util.Map):boolean");
    }

    public final void b(@k String str) {
        this.f166197g.c(new y.a(this.f166196f.a("calls", "{{%app_ver%}}", "push_handler_parsing", "extracting_".concat(str)).f91030a, 1L));
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacVoipPushHandler", "VoipPush parsing error: key=".concat(str), null);
    }
}
