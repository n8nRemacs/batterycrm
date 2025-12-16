package com.avito.android.messenger.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBindingHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/util/o;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<ComponentName, IBinder, G0> f197444a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<ComponentName, G0> f197445b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f197446c;

    /* compiled from: ServiceBindingHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/ComponentName;", "a", "Landroid/os/IBinder;", "b", "Lkotlin/G0;", "invoke", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ComponentName, IBinder, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f197447l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(ComponentName componentName, IBinder iBinder) {
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBindingHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/ComponentName;", "a", "Lkotlin/G0;", "invoke", "(Landroid/content/ComponentName;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<ComponentName, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f197448l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(ComponentName componentName) {
            return G0.f406611a;
        }
    }

    /* compiled from: ServiceBindingHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f197449l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public o() {
        throw null;
    }

    public o(Context context, Intent intent, ServiceConnection serviceConnection, Y41.p pVar, Y41.l lVar, Y41.a aVar, int i12, C42822w c42822w) {
        pVar = (i12 & 8) != 0 ? a.f197447l : pVar;
        lVar = (i12 & 16) != 0 ? b.f197448l : lVar;
        aVar = (i12 & 32) != 0 ? c.f197449l : aVar;
        this.f197444a = pVar;
        this.f197445b = lVar;
        this.f197446c = aVar;
    }
}
