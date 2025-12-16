package com.avito.android.lib.design.ticking_button;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.g;

/* compiled from: TickingButtonWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/ticking_button/b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Button f180941a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f180942b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f180943c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public y f180944d;

    /* renamed from: e, reason: collision with root package name */
    public long f180945e;

    /* renamed from: f, reason: collision with root package name */
    public long f180946f;

    /* compiled from: TickingButtonWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            b bVar = b.this;
            long j12 = bVar.f180945e - 1;
            bVar.f180945e = j12;
            Button button = bVar.f180941a;
            if (j12 > 0) {
                button.setText(bVar.f180943c.a(j12));
                return;
            }
            y yVar = bVar.f180944d;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            bVar.f180945e = bVar.f180946f;
            button.setEnabled(true);
            button.setText(bVar.f180942b);
        }
    }

    /* compiled from: TickingButtonWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.design.ticking_button.b$b, reason: collision with other inner class name */
    public static final class C5324b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final C5324b<T> f180948b = new C5324b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Ticking failed", (Throwable) obj);
        }
    }

    public b(@k Button button, @k String str, @k d dVar, @l Bundle bundle) {
        y yVar;
        this.f180941a = button;
        this.f180942b = str;
        this.f180943c = dVar;
        if (bundle != null) {
            this.f180945e = bundle.getLong("key_current_time");
            this.f180946f = bundle.getLong("key_initial_time");
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - bundle.getLong("key_timestamp_sec");
            long j12 = this.f180945e;
            if (seconds >= j12) {
                this.f180945e = this.f180946f;
            } else {
                this.f180945e = j12 - seconds;
            }
        }
        if (this.f180945e >= this.f180946f || !((yVar = this.f180944d) == null || yVar.getF318621e())) {
            button.setText(str);
        } else {
            button.setText(dVar.a(this.f180945e));
            a();
        }
    }

    public final void a() {
        Button button = this.f180941a;
        button.setEnabled(false);
        button.setText(this.f180943c.a(this.f180945e));
        this.f180944d = (y) z.a0(1L, 1L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).v0(new a(), C5324b.f180948b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public /* synthetic */ b(Button button, String str, d dVar, Bundle bundle, int i12, C42822w c42822w) {
        this(button, str, (i12 & 4) != 0 ? new com.avito.android.lib.design.ticking_button.a() : dVar, bundle);
    }
}
