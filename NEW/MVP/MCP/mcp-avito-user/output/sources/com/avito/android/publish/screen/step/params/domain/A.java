package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.remote.model.category_parameters.TextualTag;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/TextualTag;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/TextualTag;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class A extends kotlin.jvm.internal.N implements Y41.l<TextualTag, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f241129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(String str) {
        super(1);
        this.f241129l = str;
    }

    @Override // Y41.l
    public final Boolean invoke(TextualTag textualTag) {
        return Boolean.valueOf(C43066x.q(this.f241129l, textualTag.getValue(), false));
    }
}
