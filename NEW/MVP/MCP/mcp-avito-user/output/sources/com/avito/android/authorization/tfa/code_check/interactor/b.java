package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.code_check_public.CodeCheckLink;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TfaCodeCheckCodeConfirmInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.interactor.TfaCodeCheckCodeConfirmInteractor", f = "TfaCodeCheckCodeConfirmInteractor.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {105, 106, 108}, m = "handleConfirmSuccess-_gRkDGQ", n = {"this", "$this$handleConfirmSuccess_u2d_gRkDGQ", "loginResult", "phone", "loginInfo", "login", "$this$handleConfirmSuccess_u2d_gRkDGQ", "loginResult", "phone", "loginInfo", "loginResult", "phone", "loginInfo"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes11.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f94659q;

    /* renamed from: r, reason: collision with root package name */
    public Object f94660r;

    /* renamed from: s, reason: collision with root package name */
    public Object f94661s;

    /* renamed from: t, reason: collision with root package name */
    public Object f94662t;

    /* renamed from: u, reason: collision with root package name */
    public CodeCheckLink.Flow.TfaCheck.LoginInfo.ByLogin f94663u;

    /* renamed from: v, reason: collision with root package name */
    public String f94664v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f94665w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f94666x;

    /* renamed from: y, reason: collision with root package name */
    public int f94667y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f94666x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f94665w = obj;
        this.f94667y |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f94666x, null, null, null, this);
    }
}
