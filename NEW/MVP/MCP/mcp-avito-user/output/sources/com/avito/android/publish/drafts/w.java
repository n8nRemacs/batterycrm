package com.avito.android.publish.drafts;

import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.Metadata;

/* compiled from: PublishDraftRepository.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/publish/drafts/h;", "kotlin.jvm.PlatformType", "localDraft", "Lio/reactivex/rxjava3/core/w;", "Lcom/avito/android/publish/drafts/I;", "apply", "(Lcom/avito/android/publish/drafts/h;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f235413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f235414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f235415d;

    public w(boolean z12, x xVar, boolean z13) {
        this.f235413b = z12;
        this.f235414c = xVar;
        this.f235415d = z13;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C33842h c33842h = (C33842h) obj;
        if (!this.f235413b) {
            return C41928w.f403335b;
        }
        Boolean boolValueOf = Boolean.valueOf(this.f235415d);
        x xVar = this.f235414c;
        return new io.reactivex.rxjava3.internal.operators.single.D(xVar.f(c33842h, boolValueOf), new v(xVar));
    }
}
