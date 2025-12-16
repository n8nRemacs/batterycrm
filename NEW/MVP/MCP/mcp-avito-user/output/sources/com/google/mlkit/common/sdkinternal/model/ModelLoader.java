package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.C36713l;
import j.N;
import j.l0;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
@l0
/* loaded from: classes6.dex */
public class ModelLoader {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @RX0.a
    public static final class ModelLoadingState {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ModelLoadingState[] f362344b = {new ModelLoadingState("NO_MODEL_LOADED", 0), new ModelLoadingState("REMOTE_MODEL_LOADED", 1), new ModelLoadingState("LOCAL_MODEL_LOADED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ModelLoadingState EF5;

        @N
        public static ModelLoadingState[] values() {
            return (ModelLoadingState[]) f362344b.clone();
        }
    }

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @RX0.a
    public interface a {
    }

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @RX0.a
    public interface b {
    }

    static {
        new C36713l("ModelLoader", "");
    }
}
