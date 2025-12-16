package ru.cyberity.ff;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: FeatureBridge.kt */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/cyberity/ff/FeatureBridge;", "", "<init>", "()V", "", "Lru/cyberity/ff/core/a;", "Landroid/os/Bundle;", "serialize", "(Ljava/util/Collection;)Landroid/os/Bundle;", "getLocalFeatures", "()Landroid/os/Bundle;", "getRemoteFeatures", "", "name", "", "isEnabled", "value", "Lkotlin/G0;", "overrideFeature", "(Ljava/lang/String;ZLjava/lang/String;)V", "clearOverride", "(Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class FeatureBridge {

    @k
    public static final FeatureBridge INSTANCE = new FeatureBridge();

    private FeatureBridge() {
    }

    private final Bundle serialize(Collection<ru.cyberity.ff.core.a> collection) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (ru.cyberity.ff.core.a aVar : collection) {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("name", aVar.getName());
            bundle.putBoolean("local_only", aVar.getLocalOnly());
            bundle.putCharSequence("human_readable_description", aVar.getHumanReadableDescription());
            bundle.putBoolean("default_enabled", aVar.getDefaultValue().getIsEnabled());
            if (aVar.getDefaultValue().getValue() != null) {
                bundle.putCharSequence("default_value", aVar.getDefaultValue().getValue());
            }
            arrayList.add(bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("features", arrayList);
        return bundle2;
    }

    public final void clearOverride(@k String name) {
        a.f435638a.a(name);
    }

    @k
    public final Bundle getLocalFeatures() {
        return serialize(a.f435638a.l().a());
    }

    @k
    public final Bundle getRemoteFeatures() {
        return serialize(a.f435638a.l().b());
    }

    public final void overrideFeature(@k String name, boolean isEnabled, @l String value) {
        a.f435638a.a(name, isEnabled, value);
    }
}
