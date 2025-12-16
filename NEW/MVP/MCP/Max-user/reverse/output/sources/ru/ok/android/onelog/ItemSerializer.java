package ru.ok.android.onelog;

import defpackage.e2;
import defpackage.gy7;
import java.io.IOException;

/* loaded from: classes2.dex */
class ItemSerializer {
    public static final String COUNT = "count";
    public static final String CUSTOM = "custom";
    public static final String DATA = "data";
    public static final String GROUPS = "groups";
    public static final ItemSerializer INSTANCE = new ItemSerializer();
    public static final String NETWORK = "network";
    public static final String OPERATION = "operation";
    public static final String TIME = "time";
    public static final String TIMESTAMP = "timestamp";
    public static final String TYPE = "type";
    public static final String UID = "uid";

    public void serialize(gy7 gy7Var, OneLogItem oneLogItem) throws IOException {
        gy7Var.p();
        gy7Var.b0("timestamp");
        e2 e2Var = (e2) gy7Var;
        e2Var.c(Long.toString(oneLogItem.timestamp()));
        gy7Var.b0("type");
        e2Var.l(oneLogItem.type());
        gy7Var.b0("operation");
        gy7Var.h(oneLogItem.operation());
        gy7Var.b0("time");
        e2Var.c(Long.toString(oneLogItem.time()));
        String strUid = oneLogItem.uid();
        if (strUid != null) {
            gy7Var.b0("uid");
            gy7Var.h(strUid);
        }
        String strNetwork = oneLogItem.network();
        if (strNetwork != null) {
            gy7Var.b0("network");
            gy7Var.h(strNetwork);
        }
        if (oneLogItem.count() != 1) {
            gy7Var.b0("count");
            e2Var.l(oneLogItem.count());
        }
        int iGroupsCount = oneLogItem.groupsCount();
        if (iGroupsCount > 0) {
            gy7Var.b0("groups");
            gy7Var.r();
            for (int i = 0; i < iGroupsCount; i++) {
                e2Var.d(oneLogItem.group(i));
            }
            gy7Var.q();
        }
        int iDataCount = oneLogItem.dataCount();
        if (iDataCount > 0) {
            gy7Var.b0("data");
            gy7Var.r();
            for (int i2 = 0; i2 < iDataCount; i2++) {
                e2Var.d(oneLogItem.datum(i2));
            }
            gy7Var.q();
        }
        int iCustomCount = oneLogItem.customCount();
        if (iCustomCount > 0) {
            gy7Var.b0("custom");
            gy7Var.p();
            for (int i3 = 0; i3 < iCustomCount; i3++) {
                gy7Var.b0(oneLogItem.customKey(i3));
                e2Var.d(oneLogItem.customValue(i3));
            }
            gy7Var.n();
        }
        gy7Var.n();
    }
}
