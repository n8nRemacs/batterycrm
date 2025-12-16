package com.avito.android.email.email_update.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmailUpdateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.email.email_update.mvi.EmailUpdateActor", f = "EmailUpdateActor.kt", i = {0}, l = {69, 77}, m = "updateLocalCredentials", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f147213q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147214r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f147215s;

    /* renamed from: t, reason: collision with root package name */
    public int f147216t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147215s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147214r = obj;
        this.f147216t |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.c(this.f147215s, this);
    }
}
