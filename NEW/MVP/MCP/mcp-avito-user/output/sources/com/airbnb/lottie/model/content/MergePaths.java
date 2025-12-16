package com.airbnb.lottie.model.content;

import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import j.P;

/* loaded from: classes10.dex */
public class MergePaths implements c {

    /* renamed from: a, reason: collision with root package name */
    public final MergePathsMode f59671a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59672b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MergePathsMode {

        /* renamed from: b, reason: collision with root package name */
        public static final MergePathsMode f59673b;

        /* renamed from: c, reason: collision with root package name */
        public static final MergePathsMode f59674c;

        /* renamed from: d, reason: collision with root package name */
        public static final MergePathsMode f59675d;

        /* renamed from: e, reason: collision with root package name */
        public static final MergePathsMode f59676e;

        /* renamed from: f, reason: collision with root package name */
        public static final MergePathsMode f59677f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ MergePathsMode[] f59678g;

        static {
            MergePathsMode mergePathsMode = new MergePathsMode("MERGE", 0);
            f59673b = mergePathsMode;
            MergePathsMode mergePathsMode2 = new MergePathsMode("ADD", 1);
            f59674c = mergePathsMode2;
            MergePathsMode mergePathsMode3 = new MergePathsMode("SUBTRACT", 2);
            f59675d = mergePathsMode3;
            MergePathsMode mergePathsMode4 = new MergePathsMode("INTERSECT", 3);
            f59676e = mergePathsMode4;
            MergePathsMode mergePathsMode5 = new MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
            f59677f = mergePathsMode5;
            f59678g = new MergePathsMode[]{mergePathsMode, mergePathsMode2, mergePathsMode3, mergePathsMode4, mergePathsMode5};
        }

        public MergePathsMode() {
            throw null;
        }

        public static MergePathsMode valueOf(String str) {
            return (MergePathsMode) Enum.valueOf(MergePathsMode.class, str);
        }

        public static MergePathsMode[] values() {
            return (MergePathsMode[]) f59678g.clone();
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z12) {
        this.f59671a = mergePathsMode;
        this.f59672b = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    @P
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        if (b12.l()) {
            return new com.airbnb.lottie.animation.content.l(this);
        }
        com.airbnb.lottie.utils.e.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f59671a + '}';
    }
}
