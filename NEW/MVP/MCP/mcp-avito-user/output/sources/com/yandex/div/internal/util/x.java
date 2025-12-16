package com.yandex.div.internal.util;

import android.view.View;
import com.yandex.div.internal.widget.tabs.z;
import j.D;
import j.N;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Views.java */
/* loaded from: classes7.dex */
public class x {

    /* compiled from: Views.java */
    public interface a {
    }

    /* compiled from: Views.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @N
    public static View a(@N z zVar, @D int i12) {
        View viewFindViewById = zVar.findViewById(i12);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException("View with id [" + zVar.getResources().getResourceName(i12) + "] doesn't exist");
    }
}
