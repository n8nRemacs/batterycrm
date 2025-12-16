package com.avito.android.comfortable_deal.deeplink;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ComfortableDealClientRoomDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.comfortable_deal.deeplink.ComfortableDealClientRoomDeeplinkHandler", f = "ComfortableDealClientRoomDeeplinkHandler.kt", i = {0, 0}, l = {62}, m = "processForNativeScreen", n = {"this", Constants.DEEPLINK}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.comfortable_deal.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29461b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C29462c f121894q;

    /* renamed from: r, reason: collision with root package name */
    public ComfortableDealClientRoomDeeplink f121895r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f121896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29462c f121897t;

    /* renamed from: u, reason: collision with root package name */
    public int f121898u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29461b(C29462c c29462c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f121897t = c29462c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f121896s = obj;
        this.f121898u |= BeduinInputModel.MIN_TEXT_VERSION;
        return C29462c.k(this.f121897t, null, this);
    }
}
