package ru.cyberity.cbr.core.common;

import android.content.res.Resources;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import ru.cyberity.log.logger.Logger;

/* compiled from: StringResources.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/common/w0;", "Landroid/content/res/Resources;", "", "id", "", "getText", "(I)Ljava/lang/CharSequence;", "def", "(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "Ljava/lang/ref/WeakReference;", "Lru/cyberity/cbr/core/common/v0;", "a", "Ljava/lang/ref/WeakReference;", "stringRepository", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class w0 extends Resources {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final WeakReference<v0> stringRepository;

    @Override // android.content.res.Resources
    @Y61.k
    public CharSequence getText(int id2) throws Resources.NotFoundException {
        String resourceEntryName = getResourceEntryName(id2);
        v0 v0Var = this.stringRepository.get();
        CharSequence charSequenceA = v0Var != null ? v0Var.a(resourceEntryName) : null;
        if (charSequenceA != null) {
            return charSequenceA;
        }
        CharSequence text = super.getText(id2);
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        String strA = ru.cyberity.log.c.a(this);
        StringBuilder sbA = androidx.appcompat.app.r.A("StringResources.getText for ", resourceEntryName, " = ");
        sbA.append((Object) super.getText(id2));
        sbA.append(" is not found");
        Logger.e$default(aVar, strA, sbA.toString(), null, 4, null);
        return text;
    }

    @Override // android.content.res.Resources
    @Y61.k
    public CharSequence getText(int id2, @Y61.k CharSequence def) throws Resources.NotFoundException {
        String resourceEntryName = getResourceEntryName(id2);
        v0 v0Var = this.stringRepository.get();
        CharSequence charSequenceA = v0Var != null ? v0Var.a(resourceEntryName) : null;
        if (charSequenceA != null) {
            return charSequenceA;
        }
        CharSequence text = super.getText(id2, def);
        Logger.e$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "StringResources.getText with def=" + ((Object) def) + " for " + resourceEntryName + " = " + ((Object) super.getText(id2)) + " is not found", null, 4, null);
        return text;
    }
}
