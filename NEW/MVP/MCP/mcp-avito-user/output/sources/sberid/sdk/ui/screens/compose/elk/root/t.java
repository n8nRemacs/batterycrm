package sberid.sdk.ui.screens.compose.elk.root;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import gc1.InterfaceC40658b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f437837q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f437838r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f437839s;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f437840t;

    /* renamed from: u, reason: collision with root package name */
    public N41.g f437841u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC40658b f437842v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f437843w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f437844x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w f437845y;

    /* renamed from: z, reason: collision with root package name */
    public int f437846z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f437845y = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f437844x = obj;
        this.f437846z |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f437845y.ke(null, null, null, null, null, this);
    }
}
