package com.avito.android.publish.objects;

import android.os.Handler;
import android.os.Looper;
import com.avito.android.publish.details.C33745e;
import com.avito.android.publish.details.C33789t;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ObjectFillButtonHelper.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/c;", "Lcom/avito/android/publish/objects/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.objects.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33890c implements InterfaceC33888b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f237590a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Handler f237591b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.group.item.double_input.e f237592c = new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 26);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C33789t f237593d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C33745e f237594e;

    /* compiled from: ObjectFillButtonHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.objects.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C33789t c33789t = C33890c.this.f237593d;
            if (c33789t != null) {
                c33789t.W();
            }
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public C33890c(@Y61.k com.avito.android.details.a aVar) {
        this.f237590a = aVar;
    }

    @Override // com.avito.android.publish.objects.InterfaceC33888b
    public final void a(@Y61.k C33789t c33789t, @Y61.k C33745e c33745e) {
        this.f237593d = c33789t;
        this.f237594e = c33745e;
    }

    @Override // com.avito.android.publish.details.InterfaceC33682c0
    public final void i(boolean z12) {
        ParametersTree parametersTreeWa = this.f237590a.wa();
        int count = parametersTreeWa != null ? parametersTreeWa.getCount() : 0;
        Handler handler = this.f237591b;
        com.avito.android.inline_filters.dialog.group.item.double_input.e eVar = this.f237592c;
        if (count <= 1) {
            handler.removeCallbacks(eVar);
            C33745e c33745e = this.f237594e;
            if (c33745e != null) {
                c33745e.b();
                return;
            }
            return;
        }
        if (!z12) {
            handler.removeCallbacks(eVar);
            handler.postDelayed(eVar, 200L);
            C33789t c33789t = this.f237593d;
            if (c33789t != null) {
                c33789t.u();
                return;
            }
            return;
        }
        handler.removeCallbacks(eVar);
        C33745e c33745e2 = this.f237594e;
        if (c33745e2 != null) {
            c33745e2.k();
        }
        C33789t c33789t2 = this.f237593d;
        if (c33789t2 != null) {
            c33789t2.t(new a());
        }
    }
}
