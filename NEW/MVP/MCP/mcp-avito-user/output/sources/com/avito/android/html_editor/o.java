package com.avito.android.html_editor;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import gJ.C40588a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EditorHistoryProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_editor/o;", "Lcom/avito/android/html_editor/b;", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f164154a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f164155b;

    @Inject
    public o(@C40588a.b @Y61.k AK0.l lVar, @Y61.k @C40588a.c Gson gson) {
        this.f164154a = lVar;
        this.f164155b = gson;
    }

    public static String e(int i12, String str) {
        return "history_state" + str + '_' + i12;
    }

    @Override // com.avito.android.html_editor.b
    @Y61.l
    public final d a(int i12, @Y61.k String str) {
        String string = this.f164154a.getString(e(i12, str));
        if (string != null) {
            return (d) this.f164155b.d(d.class, string);
        }
        return null;
    }

    @Override // com.avito.android.html_editor.b
    @SuppressLint({"ApplySharedPref"})
    public final void b() {
        this.f164154a.getF316a().edit().clear().apply();
    }

    @Override // com.avito.android.html_editor.b
    @SuppressLint({"ApplySharedPref"})
    public final void c(int i12, int i13, @Y61.k String str) {
        if (i12 == i13) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f164154a.getF316a().edit();
        kotlin.ranges.k it = new kotlin.ranges.l(i12, i13, 1).iterator();
        while (it.f406910d) {
            editorEdit.remove(e(it.a(), str));
        }
        editorEdit.apply();
    }

    @Override // com.avito.android.html_editor.b
    public final void d(@Y61.k String str, int i12, @Y61.k d dVar) {
        this.f164154a.putString(e(i12, str), this.f164155b.l(dVar));
    }
}
