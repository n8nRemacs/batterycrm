package com.avito.android.email.email_confirmation.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmailConfirmationBootstrap.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.email.email_confirmation.mvi.EmailConfirmationBootstrap", f = "EmailConfirmationBootstrap.kt", i = {0}, l = {56, 64}, m = "updateLocalCredentials", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f147131q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147132r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f147133s;

    /* renamed from: t, reason: collision with root package name */
    public int f147134t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147133s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147132r = obj;
        this.f147134t |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.c(this.f147133s, this);
    }
}
