package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers;

import androidx.compose.runtime.C22066f2;
import com.avito.android.messenger.MessageDeliveryStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OutgoingMessage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class F extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192279l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessageDeliveryStatus f192280m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f192281n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f192282o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, MessageDeliveryStatus messageDeliveryStatus, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f192279l = str;
        this.f192280m = messageDeliveryStatus;
        this.f192281n = vVar;
        this.f192282o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192282o | 1);
        androidx.compose.ui.v vVar = this.f192281n;
        v.b(this.f192279l, this.f192280m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
