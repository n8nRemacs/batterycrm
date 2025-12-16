package ru.cyberity.cbr.core.presentation.helper.camera;

import Y41.l;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: CBRCameraHelperStateFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/r;", "it", "", "invoke", "(Lru/cyberity/cbr/core/data/model/r;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRCameraHelperStateFactory$prepareBriefDetails$briefList$1 extends N implements l<r, CharSequence> {
    final /* synthetic */ c.C12476c $strings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRCameraHelperStateFactory$prepareBriefDetails$briefList$1(c.C12476c c12476c) {
        super(1);
        this.$strings = c12476c;
    }

    @Override // Y41.l
    @k
    public final CharSequence invoke(@k r rVar) {
        return r.a(rVar, this.$strings, null, 2, null);
    }
}
