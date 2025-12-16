package com.google.crypto.tink.internal;

import I41.h;
import aZ0.j;
import androidx.camera.core.Q;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.security.GeneralSecurityException;
import java.util.Objects;

@j
/* loaded from: classes6.dex */
public final class LegacyProtoKey extends Key {
    private final ProtoKeySerialization serialization;

    /* renamed from: com.google.crypto.tink.internal.LegacyProtoKey$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[KeyData.KeyMaterialType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = iArr;
            try {
                iArr[KeyData.KeyMaterialType.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @j
    public static class LegacyProtoParametersNotForCreation extends Parameters {
        private final OutputPrefixType outputPrefixType;
        private final String typeUrl;

        public /* synthetic */ LegacyProtoParametersNotForCreation(String str, OutputPrefixType outputPrefixType, AnonymousClass1 anonymousClass1) {
            this(str, outputPrefixType);
        }

        private static String outputPrefixToString(OutputPrefixType outputPrefixType) {
            int i12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
            return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        }

        @Override // com.google.crypto.tink.Parameters
        public boolean hasIdRequirement() {
            return this.outputPrefixType != OutputPrefixType.RAW;
        }

        public String toString() {
            return Q.a("(typeUrl=", this.typeUrl, ", outputPrefixType=", outputPrefixToString(this.outputPrefixType), ")");
        }

        private LegacyProtoParametersNotForCreation(String str, OutputPrefixType outputPrefixType) {
            this.typeUrl = str;
            this.outputPrefixType = outputPrefixType;
        }
    }

    public LegacyProtoKey(ProtoKeySerialization protoKeySerialization, @h SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        throwIfMissingAccess(protoKeySerialization, secretKeyAccess);
        this.serialization = protoKeySerialization;
    }

    private static void throwIfMissingAccess(ProtoKeySerialization protoKeySerialization, @h SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        int i12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[protoKeySerialization.getKeyMaterialType().ordinal()];
        if (i12 == 1 || i12 == 2) {
            SecretKeyAccess.requireAccess(secretKeyAccess);
        }
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof LegacyProtoKey)) {
            return false;
        }
        ProtoKeySerialization protoKeySerialization = ((LegacyProtoKey) key).serialization;
        if (protoKeySerialization.getOutputPrefixType().equals(this.serialization.getOutputPrefixType()) && protoKeySerialization.getKeyMaterialType().equals(this.serialization.getKeyMaterialType()) && protoKeySerialization.getTypeUrl().equals(this.serialization.getTypeUrl()) && Objects.equals(protoKeySerialization.getIdRequirementOrNull(), this.serialization.getIdRequirementOrNull())) {
            return Bytes.equal(this.serialization.getValue().toByteArray(), protoKeySerialization.getValue().toByteArray());
        }
        return false;
    }

    @Override // com.google.crypto.tink.Key
    @h
    public Integer getIdRequirementOrNull() {
        return this.serialization.getIdRequirementOrNull();
    }

    @Override // com.google.crypto.tink.Key
    public Parameters getParameters() {
        return new LegacyProtoParametersNotForCreation(this.serialization.getTypeUrl(), this.serialization.getOutputPrefixType(), null);
    }

    public ProtoKeySerialization getSerialization(@h SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        throwIfMissingAccess(this.serialization, secretKeyAccess);
        return this.serialization;
    }
}
