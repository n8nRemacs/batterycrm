package ru.ok.android.externcalls.sdk.net;

import defpackage.fni;
import defpackage.y07;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/net/FileValidationConfig;", "", "", "expectedChecksum", "Ly07;", "hashAlgorithm", "<init>", "(Ljava/lang/String;Ly07;)V", "component1", "()Ljava/lang/String;", "component2", "()Ly07;", "copy", "(Ljava/lang/String;Ly07;)Lru/ok/android/externcalls/sdk/net/FileValidationConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExpectedChecksum", "Ly07;", "getHashAlgorithm", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FileValidationConfig {
    private final String expectedChecksum;
    private final y07 hashAlgorithm;

    public FileValidationConfig(String str, y07 y07Var) {
        this.expectedChecksum = str;
        this.hashAlgorithm = y07Var;
    }

    public static /* synthetic */ FileValidationConfig copy$default(FileValidationConfig fileValidationConfig, String str, y07 y07Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileValidationConfig.expectedChecksum;
        }
        if ((i & 2) != 0) {
            y07Var = fileValidationConfig.hashAlgorithm;
        }
        return fileValidationConfig.copy(str, y07Var);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExpectedChecksum() {
        return this.expectedChecksum;
    }

    /* renamed from: component2, reason: from getter */
    public final y07 getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public final FileValidationConfig copy(String expectedChecksum, y07 hashAlgorithm) {
        return new FileValidationConfig(expectedChecksum, hashAlgorithm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileValidationConfig)) {
            return false;
        }
        FileValidationConfig fileValidationConfig = (FileValidationConfig) other;
        return fni.a(this.expectedChecksum, fileValidationConfig.expectedChecksum) && this.hashAlgorithm == fileValidationConfig.hashAlgorithm;
    }

    public final String getExpectedChecksum() {
        return this.expectedChecksum;
    }

    public final y07 getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public int hashCode() {
        return this.hashAlgorithm.hashCode() + (this.expectedChecksum.hashCode() * 31);
    }

    public String toString() {
        return "FileValidationConfig(expectedChecksum=" + this.expectedChecksum + ", hashAlgorithm=" + this.hashAlgorithm + ")";
    }
}
