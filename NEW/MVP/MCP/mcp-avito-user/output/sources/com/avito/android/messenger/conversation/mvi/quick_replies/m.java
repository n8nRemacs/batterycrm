package com.avito.android.messenger.conversation.mvi.quick_replies;

import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.quick_replies.f;
import com.avito.android.remote.model.Image;
import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;

/* compiled from: QuickRepliesPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/remote/model/Image;", "avatar", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.e f194113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f194114c;

    public m(f.e eVar, f fVar) {
        this.f194113b = eVar;
        this.f194114c = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        O oR2 = this.f194114c.f194100W.getQuickReplies().r(l.f194112b);
        Image image = (Image) ((Y0) obj).c();
        this.f194113b.getClass();
        return oR2.r(new n(image));
    }
}
