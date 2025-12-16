package bU;

import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.theme.AbstractC36354b;
import com.avito.beduin.v2.theme.m;
import kotlin.Metadata;

/* compiled from: ComposeAvitoAndroidComposer.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LbU/a;", "Style", "Lcom/avito/beduin/v2/theme/m;", "Patch", "Lcom/avito/beduin/v2/theme/b;", "LbU/c;", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bU.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC25557a<Style, Patch extends m> extends AbstractC36354b<Patch, InterfaceC25559c<Style>> {
    @Override // com.avito.beduin.v2.theme.AbstractC36354b, com.avito.beduin.v2.theme.c
    public final Object a(@Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.l m mVar, @Y61.l Object obj) {
        return c(mVar, obj, false, kVar);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b, com.avito.beduin.v2.theme.c
    public final <T> T b(@Y61.l Patch patch, @Y61.k com.avito.beduin.v2.theme.k kVar) {
        return (T) c(patch, null, true, kVar);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object e(com.avito.beduin.v2.theme.k kVar, m mVar, Object obj) {
        return f((InterfaceC25559c) obj, mVar);
    }
}
