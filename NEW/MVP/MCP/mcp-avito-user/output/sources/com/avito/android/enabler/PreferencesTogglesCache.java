package com.avito.android.enabler;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.avito.android.enabler.model.BooleanToggle;
import com.avito.android.enabler.model.RemoteToggles;
import kotlin.Metadata;

/* compiled from: PersistentTogglesCache.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/enabler/PreferencesTogglesCache;", "Lcom/avito/android/enabler/PersistentTogglesCache;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/G0;", "drop", "()V", "", "key", "", "getToggle", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Lcom/avito/android/enabler/model/RemoteToggles;", "remoteToggles", "saveToggles", "(Lcom/avito/android/enabler/model/RemoteToggles;)V", "Landroid/content/SharedPreferences;", "togglesPreferences", "Landroid/content/SharedPreferences;", "versionPreferences", "", "newVersion", "getSavedVersion", "()I", "setSavedVersion", "(I)V", "savedVersion", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ApplySharedPref"})
/* loaded from: classes13.dex */
public final class PreferencesTogglesCache implements PersistentTogglesCache {

    @k
    private final SharedPreferences togglesPreferences;

    @k
    private final SharedPreferences versionPreferences;

    public PreferencesTogglesCache(@k Context context) {
        this.togglesPreferences = PersistentTogglesCacheKt.getTogglesPreferences(context);
        this.versionPreferences = PersistentTogglesCacheKt.getVersionPreferences(context);
    }

    @Override // com.avito.android.enabler.PersistentTogglesCache
    public void drop() {
        this.togglesPreferences.edit().clear().commit();
        this.versionPreferences.edit().clear().commit();
    }

    @Override // com.avito.android.enabler.PersistentTogglesCache
    public int getSavedVersion() {
        return this.versionPreferences.getInt("enabler_version_code_key", 0);
    }

    @Override // com.avito.android.enabler.PersistentTogglesCache
    @l
    public Boolean getToggle(@k String key) {
        if (this.togglesPreferences.contains(key)) {
            return Boolean.valueOf(this.togglesPreferences.getBoolean(key, false));
        }
        return null;
    }

    @Override // com.avito.android.enabler.PersistentTogglesCache
    public void saveToggles(@k RemoteToggles remoteToggles) {
        SharedPreferences.Editor editorEdit = this.togglesPreferences.edit();
        editorEdit.clear();
        for (BooleanToggle booleanToggle : remoteToggles.getToggles()) {
            editorEdit.putBoolean(booleanToggle.getKey(), booleanToggle.getValue());
        }
        editorEdit.commit();
    }

    @Override // com.avito.android.enabler.PersistentTogglesCache
    public void setSavedVersion(int i12) {
        this.versionPreferences.edit().putInt("enabler_version_code_key", i12).commit();
    }
}
