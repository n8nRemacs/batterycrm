package com.avito.android.employee_bug_reporter_impl.data;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BugReporterDeeplinkRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.employee_bug_reporter_impl.data.BugReporterDeepLinkRepositoryImpl", f = "BugReporterDeeplinkRepositoryImpl.kt", i = {}, l = {33, 35}, m = "loadDeepLink", n = {}, s = {})
/* loaded from: classes13.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f147270q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f147271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f147272s;

    /* renamed from: t, reason: collision with root package name */
    public int f147273t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f147272s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f147271r = obj;
        this.f147273t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f147272s.a(this);
    }
}
