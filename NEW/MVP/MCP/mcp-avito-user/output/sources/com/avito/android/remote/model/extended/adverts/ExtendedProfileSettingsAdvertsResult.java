package com.avito.android.remote.model.extended.adverts;

import Y61.k;
import aW.InterfaceC19825c;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsAdvertsResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult;", "", "items", "", "Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$Item;", "total", "", "availableSorts", "Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$SortGroup;", "sortedBy", "", "(Ljava/util/List;JLjava/util/List;I)V", "getAvailableSorts", "()Ljava/util/List;", "getItems", "getSortedBy", "()I", "getTotal", "()J", "Item", "SortGroup", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileSettingsAdvertsResult {

    @c("availableSorts")
    @k
    private final List<SortGroup> availableSorts;

    @c("list")
    @k
    private final List<Item> items;

    @c("sortedBy")
    private final int sortedBy;

    @c("total")
    private final long total;

    /* compiled from: ExtendedProfileSettingsAdvertsResult.kt */
    @InterfaceC19825c
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$Item;", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Item {
    }

    /* compiled from: ExtendedProfileSettingsAdvertsResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$SortGroup;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$SortGroup$SortDescription;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "SortDescription", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SortGroup {

        @c("name")
        @k
        private final String name;

        @c("values")
        @k
        private final List<SortDescription> values;

        /* compiled from: ExtendedProfileSettingsAdvertsResult.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$SortGroup$SortDescription;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SortDescription {

            @c("id")
            private final int id;

            @c("name")
            @k
            private final String name;

            public SortDescription(int i12, @k String str) {
                this.id = i12;
                this.name = str;
            }

            public final int getId() {
                return this.id;
            }

            @k
            public final String getName() {
                return this.name;
            }
        }

        public SortGroup(@k String str, @k List<SortDescription> list) {
            this.name = str;
            this.values = list;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final List<SortDescription> getValues() {
            return this.values;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileSettingsAdvertsResult(@k List<? extends Item> list, long j12, @k List<SortGroup> list2, int i12) {
        this.items = list;
        this.total = j12;
        this.availableSorts = list2;
        this.sortedBy = i12;
    }

    @k
    public final List<SortGroup> getAvailableSorts() {
        return this.availableSorts;
    }

    @k
    public final List<Item> getItems() {
        return this.items;
    }

    public final int getSortedBy() {
        return this.sortedBy;
    }

    public final long getTotal() {
        return this.total;
    }
}
