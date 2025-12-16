package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import Y41.q;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: NonOutgoingMessage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class j extends H implements q<Size, Integer, Integer, Float> {

    /* renamed from: b, reason: collision with root package name */
    public static final j f192363b = new j();

    public j() {
        super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
    }

    @Override // Y41.q
    public final Float invoke(Size size, Integer num, Integer num2) {
        return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
    }
}
