package com.yandex.div.core.view2.divs;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/Function0;", "Lkotlin/G0;", PluralsKeys.OTHER, "invoke", "(Ljava/lang/Exception;LY41/a;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.b1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37937b1 extends kotlin.jvm.internal.N implements Y41.p<Exception, Y41.a<? extends kotlin.G0>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.errors.d f368347l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37937b1(com.yandex.div.core.view2.errors.d dVar) {
        super(2);
        this.f368347l = dVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(Exception exc, Y41.a<? extends kotlin.G0> aVar) {
        Exception exc2 = exc;
        Y41.a<? extends kotlin.G0> aVar2 = aVar;
        if (exc2 instanceof PatternSyntaxException) {
            this.f368347l.a(new IllegalArgumentException("Invalid regex pattern '" + ((Object) ((PatternSyntaxException) exc2).getPattern()) + "'."));
        } else {
            aVar2.invoke();
        }
        return kotlin.G0.f406611a;
    }
}
