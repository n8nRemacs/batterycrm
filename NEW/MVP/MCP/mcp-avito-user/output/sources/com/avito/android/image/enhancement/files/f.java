package com.avito.android.image.enhancement.files;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageEnhanceFileStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/image/enhancement/files/f;", "Lcom/avito/android/image/enhancement/files/e;", "a", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f169371a;

    /* compiled from: ImageEnhanceFileStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/image/enhancement/files/f$a;", "", "<init>", "()V", "", "PREFERENCES_NAME", "Ljava/lang/String;", "_avito_image-enhancement_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public f(@k Context context) {
        this.f169371a = context.getSharedPreferences("image-enhance-files", 0);
    }

    @Override // com.avito.android.image.enhancement.files.e
    public final void a(@k File file, @k String str) {
        if (file.exists()) {
            SharedPreferences.Editor editorEdit = this.f169371a.edit();
            editorEdit.putString(str, file.getAbsolutePath());
            editorEdit.apply();
        }
    }

    @Override // com.avito.android.image.enhancement.files.e
    @l
    public final File getFile(@k String str) {
        String string = this.f169371a.getString(str, null);
        if (string == null) {
            return null;
        }
        File file = new File(string);
        if (file.exists()) {
            return file;
        }
        return null;
    }
}
