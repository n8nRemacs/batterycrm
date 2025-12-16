package com.avito.android.messenger.conversation.mvi.messages.preview.preview_wrappers;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.messenger.MessageDeliveryStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OutgoingMessagePreviewWrapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f193086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f193087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MessageDeliveryStatus f193088n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f193089o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, boolean z12, MessageDeliveryStatus messageDeliveryStatus, C22096n c22096n, int i12) {
        super(2);
        this.f193086l = vVar;
        this.f193087m = z12;
        this.f193088n = messageDeliveryStatus;
        this.f193089o = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(24583);
        boolean z12 = this.f193087m;
        MessageDeliveryStatus messageDeliveryStatus = this.f193088n;
        l.a(this.f193086l, z12, messageDeliveryStatus, this.f193089o, a12, iA2);
        return G0.f406611a;
    }
}
