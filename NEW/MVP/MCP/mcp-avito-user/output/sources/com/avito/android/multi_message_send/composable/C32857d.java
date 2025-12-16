package com.avito.android.multi_message_send.composable;

import F20.e;
import android.net.Uri;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiSendListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.multi_message_send.composable.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32857d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32857d f206514a = new C32857d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f206515b = new C22096n(-1083563249, a.f206516l, false);

    /* compiled from: MultiSendListItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.multi_message_send.composable.d$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f206516l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                V.b(new e.a(123L, "Apple watch ultra", "43 800 ₽", "iStore Москва и область iStore Москва и область", "Москва, Октябрьский проспект, 6а", new Image(Collections.singletonMap(new Size(120, 140), Uri.parse("https://40.img.avito.st/image/1/1.u9TV5ra4Fz3jT9U4r5SNwYBHFTtrR5U1o0IVP2VPHzdj.GAUMQmq3L2ayliJFsddAfbN9yiuSb-6bWiho6uUkbeE"))), new F20.f(4.8d, 20L), "2 дня", true, "AnchorIdent", false), C32856c.f206513l, false, a13, 440);
            }
            return G0.f406611a;
        }
    }
}
