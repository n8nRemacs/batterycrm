package com.google.crypto.tink.monitoring;

import I41.h;
import aZ0.InterfaceC19845a;
import aZ0.j;
import androidx.camera.camera2.internal.G;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.annotations.Alpha;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Alpha
@j
/* loaded from: classes6.dex */
public final class MonitoringKeysetInfo {
    private final MonitoringAnnotations annotations;
    private final List<Entry> entries;

    @h
    private final Integer primaryKeyId;

    public static final class Builder {

        @h
        private ArrayList<Entry> builderEntries = new ArrayList<>();
        private MonitoringAnnotations builderAnnotations = MonitoringAnnotations.EMPTY;

        @h
        private Integer builderPrimaryKeyId = null;

        private boolean isKeyIdInEntries(int i12) {
            Iterator<Entry> it = this.builderEntries.iterator();
            while (it.hasNext()) {
                if (it.next().getKeyId() == i12) {
                    return true;
                }
            }
            return false;
        }

        @InterfaceC19845a
        public Builder addEntry(KeyStatus keyStatus, int i12, String str, String str2) {
            ArrayList<Entry> arrayList = this.builderEntries;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new Entry(keyStatus, i12, str, str2));
            return this;
        }

        public MonitoringKeysetInfo build() throws GeneralSecurityException {
            if (this.builderEntries == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.builderPrimaryKeyId;
            if (num != null && !isKeyIdInEntries(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            MonitoringKeysetInfo monitoringKeysetInfo = new MonitoringKeysetInfo(this.builderAnnotations, Collections.unmodifiableList(this.builderEntries), this.builderPrimaryKeyId);
            this.builderEntries = null;
            return monitoringKeysetInfo;
        }

        @InterfaceC19845a
        public Builder setAnnotations(MonitoringAnnotations monitoringAnnotations) {
            if (this.builderEntries == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.builderAnnotations = monitoringAnnotations;
            return this;
        }

        @InterfaceC19845a
        public Builder setPrimaryKeyId(int i12) {
            if (this.builderEntries == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.builderPrimaryKeyId = Integer.valueOf(i12);
            return this;
        }
    }

    @j
    public static final class Entry {
        private final int keyId;
        private final String keyPrefix;
        private final String keyType;
        private final KeyStatus status;

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.status == entry.status && this.keyId == entry.keyId && this.keyType.equals(entry.keyType) && this.keyPrefix.equals(entry.keyPrefix);
        }

        public int getKeyId() {
            return this.keyId;
        }

        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public String getKeyType() {
            return this.keyType;
        }

        public KeyStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return Objects.hash(this.status, Integer.valueOf(this.keyId), this.keyType, this.keyPrefix);
        }

        public String toString() {
            KeyStatus keyStatus = this.status;
            int i12 = this.keyId;
            String str = this.keyType;
            String str2 = this.keyPrefix;
            StringBuilder sb2 = new StringBuilder("(status=");
            sb2.append(keyStatus);
            sb2.append(", keyId=");
            sb2.append(i12);
            sb2.append(", keyType='");
            return G.h(sb2, str, "', keyPrefix='", str2, "')");
        }

        private Entry(KeyStatus keyStatus, int i12, String str, String str2) {
            this.status = keyStatus;
            this.keyId = i12;
            this.keyType = str;
            this.keyPrefix = str2;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MonitoringKeysetInfo)) {
            return false;
        }
        MonitoringKeysetInfo monitoringKeysetInfo = (MonitoringKeysetInfo) obj;
        return this.annotations.equals(monitoringKeysetInfo.annotations) && this.entries.equals(monitoringKeysetInfo.entries) && Objects.equals(this.primaryKeyId, monitoringKeysetInfo.primaryKeyId);
    }

    public MonitoringAnnotations getAnnotations() {
        return this.annotations;
    }

    public List<Entry> getEntries() {
        return this.entries;
    }

    @h
    public Integer getPrimaryKeyId() {
        return this.primaryKeyId;
    }

    public int hashCode() {
        return Objects.hash(this.annotations, this.entries);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.annotations, this.entries, this.primaryKeyId);
    }

    private MonitoringKeysetInfo(MonitoringAnnotations monitoringAnnotations, List<Entry> list, Integer num) {
        this.annotations = monitoringAnnotations;
        this.entries = list;
        this.primaryKeyId = num;
    }
}
