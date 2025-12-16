package ru.cyberity.cbr.core.data.source.settings;

import Y61.k;
import Y61.l;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: RealSettingsRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\t\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/data/source/settings/a;", "Lru/cyberity/cbr/core/data/source/settings/b;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "e", "()Ljava/lang/String;", "a", "id", "Lkotlin/G0;", "c", "(Ljava/lang/String;)V", "b", "d", "", "h", "()Z", "()V", "Ljava/util/UUID;", "f", "()Ljava/util/UUID;", "(Ljava/util/UUID;)V", "g", "type", "Landroid/content/SharedPreferences;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final SharedPreferences preferences;

    public a(@k SharedPreferences sharedPreferences) {
        this.preferences = sharedPreferences;
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    @k
    public String a() {
        String string = this.preferences.getString("applicant_id", "");
        return string == null ? "" : string;
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    @k
    public String b() {
        String string = this.preferences.getString("applicant_action_id", "");
        return string == null ? "" : string;
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    public void c(@l String id2) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        if (id2 == null) {
            editorEdit.remove("applicant_id");
        }
        if (id2 != null) {
            editorEdit.putString("applicant_id", id2);
        }
        editorEdit.commit();
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    public void d(@l String id2) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("key_external_id", id2);
        editorEdit.commit();
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    @k
    public String e() {
        String string = this.preferences.getString("device_id", null);
        if (string == null || string.length() == 0) {
            string = UUID.randomUUID().toString();
        }
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("device_id", string);
        editorEdit.commit();
        return string;
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    @l
    public UUID f() {
        try {
            return UUID.fromString(this.preferences.getString("key_session_id", ""));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    @k
    public String g() {
        return this.preferences.getString("key_network_type", "");
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    public boolean h() {
        return this.preferences.getBoolean("dont_show_settings_dialog", false);
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    public void a(@k UUID id2) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("key_session_id", id2.toString());
        editorEdit.commit();
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    public void b(@k String type) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString("key_network_type", type);
        editorEdit.commit();
    }

    @Override // ru.cyberity.cbr.core.data.source.settings.b
    public void d() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putBoolean("dont_show_settings_dialog", true);
        editorEdit.commit();
    }
}
