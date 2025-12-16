package Fc1;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class S5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13753v4 f5177a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5178b;

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<SharedPreferences> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f5179l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f5179l = context;
        }

        @Override // Y41.a
        public final SharedPreferences invoke() {
            return this.f5179l.getSharedPreferences("feedback_sdk_settings", 0);
        }
    }

    public S5(@Y61.k Context context, @Y61.k InterfaceC13753v4 interfaceC13753v4) {
        this.f5177a = interfaceC13753v4;
        this.f5178b = C42727D.c(new a(context));
    }
}
