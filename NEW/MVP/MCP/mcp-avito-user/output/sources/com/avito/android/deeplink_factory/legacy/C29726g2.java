package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import kotlin.Metadata;

/* compiled from: DeepLinkParsingScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "K", "V", "", "cause", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "Ku/e", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.deeplink_factory.legacy.g2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29726g2 extends kotlin.jvm.internal.N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f134296l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29726g2(Uri uri) {
        super(1);
        this.f134296l = uri;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) throws DeeplinkParsingError.WrongParameterValue {
        throw new DeeplinkParsingError.WrongParameterValue(this.f134296l.toString(), "extraRequestParams", DeeplinkParsingError.FieldConstraint.Json.f133989e, (Throwable) obj);
    }
}
