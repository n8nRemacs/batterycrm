package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message;

import Y41.p;
import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f192536l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192537m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f192538n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192539o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Uri uri, String str, v vVar, Y41.a aVar, int i12) {
        super(2);
        this.f192536l = uri;
        this.f192537m = str;
        this.f192538n = vVar;
        this.f192539o = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        f.a(this.f192536l, this.f192537m, this.f192539o, a12, iA2);
        return G0.f406611a;
    }
}
