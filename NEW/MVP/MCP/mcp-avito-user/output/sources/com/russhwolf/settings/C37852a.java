package com.russhwolf.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.russhwolf.settings.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidSettings.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/russhwolf/settings/a;", "Lcom/russhwolf/settings/E;", "a", "b", "multiplatform-settings_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* renamed from: com.russhwolf.settings.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37852a implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f366277a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f366278b;

    /* compiled from: AndroidSettings.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/russhwolf/settings/a$a;", "Lcom/russhwolf/settings/I$c;", "multiplatform-settings_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.russhwolf.settings.a$a, reason: collision with other inner class name */
    public static final class C10808a implements I.c {

        /* renamed from: a, reason: collision with root package name */
        public final Context f366279a;

        public C10808a(@Y61.k Context context) {
            this.f366279a = context.getApplicationContext();
        }

        @Y61.k
        public final C37852a a() {
            return new C37852a(this.f366279a.getSharedPreferences("avcalls_config_storage", 0), false, 2, null);
        }
    }

    /* compiled from: AndroidSettings.kt */
    @InterfaceC37858g
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/russhwolf/settings/a$b;", "Lcom/russhwolf/settings/K;", "multiplatform-settings_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.russhwolf.settings.a$b */
    public static final class b implements K {
    }

    public C37852a(SharedPreferences sharedPreferences, boolean z12, int i12, C42822w c42822w) {
        z12 = (i12 & 2) != 0 ? false : z12;
        this.f366277a = sharedPreferences;
        this.f366278b = z12;
    }

    @Y61.l
    public final String a() {
        SharedPreferences sharedPreferences = this.f366277a;
        if (sharedPreferences.contains("avcalls_config")) {
            return sharedPreferences.getString("avcalls_config", "");
        }
        return null;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void b(@Y61.k String str) {
        SharedPreferences.Editor editorPutString = this.f366277a.edit().putString("avcalls_config", str);
        if (this.f366278b) {
            editorPutString.commit();
        } else {
            editorPutString.apply();
        }
    }
}
