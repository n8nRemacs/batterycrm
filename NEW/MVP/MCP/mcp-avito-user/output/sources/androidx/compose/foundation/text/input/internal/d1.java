package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: TextFieldDragAndDropNode.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "dragAndDropEvent", "", "invoke", "(Landroidx/compose/ui/draganddrop/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class d1 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.draganddrop.b, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Set<androidx.compose.foundation.content.a>> f31061l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(Y41.a<? extends Set<androidx.compose.foundation.content.a>> aVar) {
        super(1);
        this.f31061l = aVar;
    }

    @Override // Y41.l
    public final Boolean invoke(androidx.compose.ui.draganddrop.b bVar) {
        ClipDescription clipDescription = bVar.f38999a.getClipDescription();
        Set<androidx.compose.foundation.content.a> setInvoke = this.f31061l.invoke();
        boolean z12 = false;
        if (!(setInvoke instanceof Collection) || !setInvoke.isEmpty()) {
            for (androidx.compose.foundation.content.a aVar : setInvoke) {
                androidx.compose.foundation.content.a.f26972b.getClass();
                if (kotlin.jvm.internal.L.f(aVar, androidx.compose.foundation.content.a.f26974d) || clipDescription.hasMimeType(aVar.f26975a)) {
                    z12 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
