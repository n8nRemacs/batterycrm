package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.extended_item_message.ExtendedItemData;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExtendedItemMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MessageBody.SystemMessageBody.Platform.ItemExtended f192518l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedItemData f192519m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f192520n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f192521o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f192522p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f192523q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MessageBody.SystemMessageBody.Platform.ItemExtended itemExtended, ExtendedItemData extendedItemData, String str, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f192518l = itemExtended;
        this.f192519m = extendedItemData;
        this.f192520n = str;
        this.f192521o = vVar;
        this.f192522p = lVar;
        this.f192523q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192523q | 1);
        androidx.compose.ui.v vVar = this.f192521o;
        ExtendedItemData extendedItemData = this.f192519m;
        String str = this.f192520n;
        l.b(this.f192518l, extendedItemData, str, vVar, this.f192522p, a12, iA2);
        return G0.f406611a;
    }
}
