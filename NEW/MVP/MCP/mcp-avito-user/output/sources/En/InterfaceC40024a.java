package eN;

import C11.b;
import Y61.k;
import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.imv_goods_poll.ImvGoodsPollDialog;
import com.avito.android.imv_goods_poll.ImvGoodsPollParams;
import kotlin.Metadata;

/* compiled from: ImvGoodsPollComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LeN/a;", "", "a", "b", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC40024a {

    /* compiled from: ImvGoodsPollComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeN/a$a;", "", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eN.a$a, reason: collision with other inner class name */
    public interface InterfaceC11076a {
        @k
        InterfaceC40024a a(@h31.b @k S0 s02, @h31.b @k Resources resources, @h31.b @k ImvGoodsPollParams imvGoodsPollParams, @h31.b @k C28478k c28478k, @h31.b @k com.avito.android.imv_goods_poll.c cVar, @k cv.d dVar);
    }

    /* compiled from: ImvGoodsPollComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeN/a$b;", "Lcom/avito/android/di/h;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: eN.a$b */
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC11076a Kf();
    }

    void a(@k ImvGoodsPollDialog imvGoodsPollDialog);
}
